package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Tiporestaurante;
import pe.edu.upc.serviceinterfaces.ITiporestauranteService;

@Named
@RequestScoped
public class TiporestauranteController {
	// enlazar controller con service
	@Inject
	private ITiporestauranteService trService;

	// variables
	private Tiporestaurante tr;
	List<Tiporestaurante> listaTiporestaurantes;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaTiporestaurantes = new ArrayList<Tiporestaurante>();
		this.tr = new Tiporestaurante();
		this.list();
	}

	public String newTiporestaurante() {
		this.setTr(new Tiporestaurante());
		return "tiporestaurante.xhtml";
	}

	public void insert() {
		try {
			trService.insert(tr);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de tiporestaurante");
		}

	}

	public void list() {
		try {
			listaTiporestaurantes = trService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de tiporestaurante");
		}
	}

	public void delete(Tiporestaurante ters) {
		try {
			trService.delete(ters.getIdTiporestaurante());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de tiporestaurante");
		}
	}

	public Tiporestaurante getTr() {
		return tr;
	}

	public void setTr(Tiporestaurante tr) {
		this.tr = tr;
	}

	public List<Tiporestaurante> getListaTiporestaurantes() {
		return listaTiporestaurantes;
	}

	public void setListaTipoRestaurantes(List<Tiporestaurante> listaTiporestaurantes) {
		this.listaTiporestaurantes = listaTiporestaurantes;
	}

}
