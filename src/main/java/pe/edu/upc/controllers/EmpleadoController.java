package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Empleado;
import pe.edu.upc.entities.Restaurante;
import pe.edu.upc.entities.Tipocertificado;
import pe.edu.upc.serviceinterfaces.IEmpleadoService;
import pe.edu.upc.serviceinterfaces.IRestauranteService;
import pe.edu.upc.serviceinterfaces.ITipocertificadoService;

@Named
@RequestScoped
public class EmpleadoController {
	// enlazar controller con service
	@Inject
	private IEmpleadoService epService;

	@Inject
	private ITipocertificadoService tService;

	@Inject
	private IRestauranteService reService;
	
	// variables
	private Empleado ep;
	List<Empleado> listaEmpleados;
	List<Tipocertificado> listaTipocertificados;
	List<Restaurante> listaRestaurantes;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaEmpleados = new ArrayList<Empleado>();
		this.ep = new Empleado();
		this.listaTipocertificados = new ArrayList<Tipocertificado>();
		this.listaRestaurantes = new ArrayList<Restaurante>();
		
		this.listTipocertificados();
		this.listRestaurantes();
		this.list();
	}

	public String newEmpleado() {
		this.setEp(new Empleado());
		return "empleado.xhtml";
	}

	public void insert() {
		try {
			epService.insert(ep);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de empleado");
		}

	}

	public void list() {
		try {
			listaEmpleados = epService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de empleado");
		}
	}

	public void listTipocertificados() {
		try {
			listaTipocertificados = tService.list();
		} catch (Exception e) {
			System.out.println("Error al listar tipocertificado en controlador de empleado");
		}

	}

	public void listRestaurantes() {
		try {
			listaRestaurantes = reService.list();
		} catch (Exception e) {
			System.out.println("Error al listar restaurantes en controlador de empleado");
		}

	}
	
	public void delete(Empleado ep) {
		try {
			epService.delete(ep.getIdEmpleado());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de empleado");
		}
	}

	// Buscar
			public void findByName() {
				try {
					listaEmpleados = epService.findByName(this.getEp());
				} catch (Exception e) {
					System.out.println("Error al buscar en el controller de empleado");
				}
			}
	
	// update
		public String preUpdate(Empleado ep) {
			this.setEp(ep);
			return "modificacionempleado.xhtml";
		}

		public void update() {

			try {
				epService.update(this.ep);
			} catch (Exception e) {
				System.out.println("Error al modificar el controlador de empleado");
			}
		}
		
	public Empleado getEp() {
		return ep;
	}

	
	public void setEp(Empleado ep) {
		this.ep = ep;
	}

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	public List<Tipocertificado> getListaTipocertificados() {
		return listaTipocertificados;
	}

	public void setListaTipocertificados(List<Tipocertificado> listaTipocertificados) {
		this.listaTipocertificados = listaTipocertificados;
	}
	
	public List<Restaurante> getListaRestaurantes() {
		return listaRestaurantes;
	}

	public void setListaRestaurantes(List<Restaurante> listaRestaurantes) {
		this.listaRestaurantes = listaRestaurantes;
	}
	
}
