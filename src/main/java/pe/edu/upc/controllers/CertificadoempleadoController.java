package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Certificadoempleado;
import pe.edu.upc.serviceinterfaces.ICertificadoempleadoService;

@Named
@RequestScoped
public class CertificadoempleadoController {
	// enlazar controller con service
	@Inject
	private ICertificadoempleadoService pService;

	// variables
	private Certificadoempleado p;
	List<Certificadoempleado> listaCertificadoempleados;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaCertificadoempleados = new ArrayList<Certificadoempleado>();
		this.p = new Certificadoempleado();
		this.list();
	}

	public String newCertificadoempleado() {
		this.setP(new Certificadoempleado());
		return "certificadoempleado.xhtml";
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
			listaCertificadoempleados = pService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de departamento");
		}
	}

	public void delete(Certificadoempleado pers) {
		try {
			pService.delete(pers.getIdCertificadoempleado());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de persona");
		}
	}

	public Certificadoempleado getP() {
		return p;
	}

	public void setP(Certificadoempleado p) {
		this.p = p;
	}

	public List<Certificadoempleado> getListaCertificadoempleados() {
		return listaCertificadoempleados;
	}

	public void setListaCertificadoempleados(List<Certificadoempleado> listaCertificadoempleados) {
		this.listaCertificadoempleados = listaCertificadoempleados;
	}

}
