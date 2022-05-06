package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Calificacion;
import pe.edu.upc.entities.Restaurante;
import pe.edu.upc.entities.Cliente;
import pe.edu.upc.serviceinterfaces.ICalificacionService;
import pe.edu.upc.serviceinterfaces.IRestauranteService;
import pe.edu.upc.serviceinterfaces.IClienteService;

@Named
@RequestScoped
public class CalificacionController {
	// enlazar controller con service
	@Inject
	private ICalificacionService liService;

	@Inject
	private IClienteService clService;

	@Inject
	private IRestauranteService reService;
	
	// variables
	private Calificacion li;
	List<Calificacion> listaCalificacions;
	List<Cliente> listaClientes;
	List<Restaurante> listaRestaurantes;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaCalificacions = new ArrayList<Calificacion>();
		this.li = new Calificacion();
		this.listaClientes = new ArrayList<Cliente>();
		this.listaRestaurantes = new ArrayList<Restaurante>();
		
		this.listClientes();
		this.listRestaurantes();
		this.list();
	}

	public String newCalificacion() {
		this.setLi(new Calificacion());
		return "calificacion.xhtml";
	}

	public void insert() {
		try {
			liService.insert(li);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de calificacion");
		}

	}

	public void list() {
		try {
			listaCalificacions = liService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de calificacion");
		}
	}

	public void listClientes() {
		try {
			listaClientes = clService.list();
		} catch (Exception e) {
			System.out.println("Error al listar cliente en controlador de calificacion");
		}

	}

	public void listRestaurantes() {
		try {
			listaRestaurantes = reService.list();
		} catch (Exception e) {
			System.out.println("Error al listar restaurantes en controlador de calificacion");
		}

	}
	
	public void delete(Calificacion cali) {
		try {
			liService.delete(cali.getIdCalificacion());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de calificacion");
		}
	}

	// update
		public String preUpdate(Calificacion li) {
			this.setLi(li);
			return "modificacioncalificacion.xhtml";
		}

		public void update() {

			try {
				liService.update(this.li);
			} catch (Exception e) {
				System.out.println("Error al modificar el controlador de calificacion");
			}
		}
		
	public Calificacion getLi() {
		return li;
	}

	
	public void setLi(Calificacion li) {
		this.li = li;
	}

	public List<Calificacion> getListaCalificacions() {
		return listaCalificacions;
	}

	public void setListaCalificacions(List<Calificacion> listaCalificacions) {
		this.listaCalificacions = listaCalificacions;
	}
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	public List<Restaurante> getListaRestaurantes() {
		return listaRestaurantes;
	}

	public void setListaRestaurantes(List<Restaurante> listaRestaurantes) {
		this.listaRestaurantes = listaRestaurantes;
	}
	
}
