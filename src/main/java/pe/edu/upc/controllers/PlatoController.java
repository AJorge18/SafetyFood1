package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Plato;
import pe.edu.upc.serviceinterfaces.IPlatoService;

@Named
@RequestScoped
public class PlatoController {
	// enlazar controller con service
	@Inject
	private IPlatoService plService;

	// variables
	private Plato pl;
	List<Plato> listaPlatos;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaPlatos = new ArrayList<Plato>();
		this.pl = new Plato();
		this.list();
	}

	public String newPlato() {
		this.setPl(new Plato());
		return "plato.xhtml";
	}

	public void insert() {
		try {
			plService.insert(pl);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de plato");
		}

	}

	public void list() {
		try {
			listaPlatos = plService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de plato");
		}
	}

	public void delete(Plato plat) {
		try {
			plService.delete(plat.getIdPlato());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de plato");
		}
	}

	public Plato getPl() {
		return pl;
	}

	public void setPl(Plato pl) {
		this.pl = pl;
	}

	public List<Plato> getListaPlatos() {
		return listaPlatos;
	}

	public void setListaPlatos(List<Plato> listaPlatos) {
		this.listaPlatos = listaPlatos;
	}

}
