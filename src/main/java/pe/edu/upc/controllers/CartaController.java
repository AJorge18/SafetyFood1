package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Carta;
import pe.edu.upc.entities.Restaurante;
import pe.edu.upc.entities.Plato;
import pe.edu.upc.serviceinterfaces.ICartaService;
import pe.edu.upc.serviceinterfaces.IRestauranteService;
import pe.edu.upc.serviceinterfaces.IPlatoService;

@Named
@RequestScoped
public class CartaController {
	// enlazar controller con service
	@Inject
	private ICartaService caService;

	@Inject
	private IPlatoService plService;

	@Inject
	private IRestauranteService reService;

	// variables
	private Carta ca;
	List<Carta> listaCartas;
	List<Plato> listaPlatos;
	List<Restaurante> listaRestaurantes;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaCartas = new ArrayList<Carta>();
		this.ca = new Carta();
		this.listaPlatos = new ArrayList<Plato>();
		this.listaRestaurantes = new ArrayList<Restaurante>();

		this.listPlatos();
		this.listRestaurantes();
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
			System.out.println("Error al insertar en el controller de carta");
		}

	}

	public void list() {
		try {
			listaCartas = caService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de carta");
		}
	}

	public void listPlatos() {
		try {
			listaPlatos = plService.list();
		} catch (Exception e) {
			System.out.println("Error al listar platos en controlador de carta");
		}

	}

	public void listRestaurantes() {
		try {
			listaRestaurantes = reService.list();
		} catch (Exception e) {
			System.out.println("Error al listar restaurantes en controlador de carta");
		}

	}

	public void delete(Carta cart) {
		try {
			caService.delete(cart.getIdCarta());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de carta");
		}
	}

	
	// update
	public String preUpdate(Carta ca) {
		this.setCa(ca);
		return "modificacioncarta.xhtml";
	}

	public void update() {

		try {
			caService.update(this.ca);
		} catch (Exception e) {
			System.out.println("Error al modificar el controlador de Carta");
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

	public List<Plato> getListaPlatos() {
		return listaPlatos;
	}

	public void setListaPlatos(List<Plato> listaPlatos) {
		this.listaPlatos = listaPlatos;
	}
	
	public List<Restaurante> getListaRestaurantes() {
		return listaRestaurantes;
	}

	public void setListaRestaurantes(List<Restaurante> listaRestaurantes) {
		this.listaRestaurantes = listaRestaurantes;
	}
	
}
