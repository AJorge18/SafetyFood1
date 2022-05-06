package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Distrito;
import pe.edu.upc.serviceinterfaces.IDistritoService;

@Named
@RequestScoped
public class DistritoController {
	// enlazar controller con service
	@Inject
	private IDistritoService diService;

	// variables
	private Distrito di;
	List<Distrito> listaDistritos;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaDistritos = new ArrayList<Distrito>();
		this.di = new Distrito();
		this.list();
	}

	public String newDistrito() {
		this.setDi(new Distrito());
		return "distrito.xhtml";
	}

	public void insert() {
		try {
			diService.insert(di);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de distrito");
		}

	}

	public void list() {
		try {
			listaDistritos = diService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de distrito");
		}
	}

	public void delete(Distrito dist) {
		try {
			diService.delete(dist.getIdDistrito());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de distrito");
		}
	}

	public Distrito getDi() {
		return di;
	}

	public void setDi(Distrito di) {
		this.di = di;
	}

	public List<Distrito> getListaDistritos() {
		return listaDistritos;
	}

	public void setListaDistritos(List<Distrito> listaDistritos) {
		this.listaDistritos = listaDistritos;
	}

}
