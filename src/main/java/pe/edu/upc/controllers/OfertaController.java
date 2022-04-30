package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Oferta;
import pe.edu.upc.serviceinterfaces.IOfertaService;

@Named
@RequestScoped
public class OfertaController {
	// enlazar controller con service
	@Inject
	private IOfertaService oService;

	// variables
	private Oferta o;
	List<Oferta> listaOfertas;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaOfertas = new ArrayList<Oferta>();
		this.o = new Oferta();
		this.list();
	}

	public String newOferta() {
		this.setO(new Oferta());
		return "oferta.xhtml";
	}

	public void insert() {
		try {
			oService.insert(o);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de departamento");
		}

	}

	public void list() {
		try {
			listaOfertas = oService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de departamento");
		}
	}

	public void delete(Oferta ofer) {
		try {
			oService.delete(ofer.getIdOferta());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de persona");
		}
	}

	public Oferta getO() {
		return o;
	}

	public void setO(Oferta o) {
		this.o = o;
	}

	public List<Oferta> getListaOfertas() {
		return listaOfertas;
	}

	public void setListaOfertas(List<Oferta> listaOfertas) {
		this.listaOfertas = listaOfertas;
	}

}
