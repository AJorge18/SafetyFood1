package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Tipousuario;
import pe.edu.upc.serviceinterfaces.ITipousuarioService;

@Named
@RequestScoped
public class TipousuarioController {
	// enlazar controller con service
	@Inject
	private ITipousuarioService pService;

	// variables
	private Tipousuario p;
	List<Tipousuario> listaTipousuarios;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaTipousuarios = new ArrayList<Tipousuario>();
		this.p = new Tipousuario();
		this.list();
	}

	public String newTipousuario() {
		this.setP(new Tipousuario());
		return "tipousuario.xhtml";
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
			listaTipousuarios = pService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de departamento");
		}
	}

	public void delete(Tipousuario pers) {
		try {
			pService.delete(pers.getIdTipousuario());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de persona");
		}
	}

	public Tipousuario getP() {
		return p;
	}

	public void setP(Tipousuario p) {
		this.p = p;
	}

	public List<Tipousuario> getlistaTipousuarios() {
		return listaTipousuarios;
	}

	public void setListaTipousuarios(List<Tipousuario> listaTipousuarios) {
		this.listaTipousuarios = listaTipousuarios;
	}

}
