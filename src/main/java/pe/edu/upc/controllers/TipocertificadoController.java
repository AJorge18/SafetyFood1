package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Tipocertificado;
import pe.edu.upc.serviceinterfaces.ITipocertificadoService;

@Named
@RequestScoped
public class TipocertificadoController {
	// enlazar controller con service
	@Inject
	private ITipocertificadoService tService;

	// variables
	private Tipocertificado t;
	List<Tipocertificado> listaTipocertificados;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaTipocertificados = new ArrayList<Tipocertificado>();
		this.t = new Tipocertificado();
		this.list();
	}

	public String newTipocertificado() {
		this.setT(new Tipocertificado());
		return "tipocertificado.xhtml";
	}

	public void insert() {
		try {
			tService.insert(t);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de tipo");
		}

	}

	public void list() {
		try {
			listaTipocertificados = tService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de tipo");
		}
	}

	public void delete(Tipocertificado ters) {
		try {
			tService.delete(ters.getIdTipocertificado());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de persona");
		}
	}

	public Tipocertificado getT() {
		return t;
	}

	public void setT(Tipocertificado t) {
		this.t = t;
	}

	public List<Tipocertificado> getListaTipocertificados() {
		return listaTipocertificados;
	}

	public void setListaTipocertificados(List<Tipocertificado> listaTipocertificados) {
		this.listaTipocertificados = listaTipocertificados;
	}

}
