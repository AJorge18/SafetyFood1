package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Carta;
import pe.edu.upc.serviceinterfaces.ICartaService;

@Named
@RequestScoped
public class CartaController {
	// enlazar controller con service
	@Inject
	private ICartaService caService;

	// variables
	private Carta ca;
	List<Carta> listaCartas;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaCartas = new ArrayList<Carta>();
		this.ca = new Carta();
		this.list();
	}

	public String newCarta() {
		this.setCa(new Carta());
		return "carta.xhtml";
	}

	public void insert() {
		try {
			caService.insert(ca);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de departamento");
		}

	}

	public void list() {
		try {
			listaCartas = caService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de departamento");
		}
	}

	public void delete(Carta cart) {
		try {
			caService.delete(cart.getIdCarta());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de persona");
		}
	}

	public Carta getCa() {
		return ca;
	}

	public void setCa(Carta ca) {
		this.ca = ca;
	}

	public List<Carta> getListaCartas() {
		return listaCartas;
	}

	public void setListaCartas(List<Carta> listaCartas) {
		this.listaCartas = listaCartas;
	}

}
