package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Certificadominsalud;
import pe.edu.upc.serviceinterfaces.ICertificadominsaludService;

@Named
@RequestScoped
public class CertificadominsaludController {
	// enlazar controller con service
	@Inject
	private ICertificadominsaludService pService;

	// variables
	private Certificadominsalud p;
	List<Certificadominsalud> listaCertificadominsaluds;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaCertificadominsaluds = new ArrayList<Certificadominsalud>();
		this.p = new Certificadominsalud();
		this.list();
	}

	public String newCertificadominsalud() {
		this.setP(new Certificadominsalud());
		return "certificadominsalud.xhtml";
	}

	public void insert() {
		try {
			pService.insert(p);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de departamento");
		}

	}

	public void list() {
		try {
			listaCertificadominsaluds = pService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de departamento");
		}
	}

	public void delete(Certificadominsalud pers) {
		try {
			pService.delete(pers.getIdCertificadominsalud());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de persona");
		}
	}

	public Certificadominsalud getP() {
		return p;
	}

	public void setP(Certificadominsalud p) {
		this.p = p;
	}

	public List<Certificadominsalud> getlistaCertificadominsaluds() {
		return listaCertificadominsaluds;
	}

	public void setListaCertificadominsaluds(List<Certificadominsalud> listaCertificadominsaluds) {
		this.listaCertificadominsaluds = listaCertificadominsaluds;
	}

}
