package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Certificadomuni;
import pe.edu.upc.serviceinterfaces.ICertificadomuniService;

@Named
@RequestScoped
public class CertificadomuniController {
	// enlazar controller con service
	@Inject
	private ICertificadomuniService pService;

	// variables
	private Certificadomuni p;
	List<Certificadomuni> listaCertificadomunis;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaCertificadomunis = new ArrayList<Certificadomuni>();
		this.p = new Certificadomuni();
		this.list();
	}

	public String newCertificadomuni() {
		this.setP(new Certificadomuni());
		return "certificadomuni.xhtml";
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
			listaCertificadomunis = pService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de departamento");
		}
	}

	public void delete(Certificadomuni pers) {
		try {
			pService.delete(pers.getIdCertificadomuni());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de persona");
		}
	}
	

	public Certificadomuni getP() {
		return p;
	}

	public void setP(Certificadomuni p) {
		this.p = p;
	}

	public List<Certificadomuni> getListaCertificadomunis() {
		return listaCertificadomunis;
	}

	public void setListaCertificadomunis(List<Certificadomuni> listaCertificadomunis) {
		this.listaCertificadomunis = listaCertificadomunis;
	}

}
