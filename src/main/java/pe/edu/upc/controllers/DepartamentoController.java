package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Departamento;
import pe.edu.upc.serviceinterfaces.IDepartamentoService;

@Named
@RequestScoped
public class DepartamentoController {
	// enlazar controller con service
	@Inject
	private IDepartamentoService deService;

	// variables
	private Departamento de;
	List<Departamento> listaDepartamentos;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaDepartamentos = new ArrayList<Departamento>();
		this.de = new Departamento();
		this.list();
	}

	public String newDepartamento() {
		this.setDe(new Departamento());
		return "departamento.xhtml";
	}

	public void insert() {
		try {
			deService.insert(de);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de departamento");
		}

	}

	public void list() {
		try {
			listaDepartamentos = deService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de departamento");
		}
	}

	public void delete(Departamento depa) {
		try {
			deService.delete(depa.getIdDepartamento());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de persona");
		}
	}

	public Departamento getDe() {
		return de;
	}

	public void setDe(Departamento de) {
		this.de = de;
	}

	public List<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}

	public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}

}
