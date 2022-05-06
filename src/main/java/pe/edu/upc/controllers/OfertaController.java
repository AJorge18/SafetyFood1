package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Oferta;
import pe.edu.upc.entities.Restaurante;
import pe.edu.upc.entities.Plato;
import pe.edu.upc.serviceinterfaces.IOfertaService;
import pe.edu.upc.serviceinterfaces.IRestauranteService;
import pe.edu.upc.serviceinterfaces.IPlatoService;

@Named
@RequestScoped
public class OfertaController {
	// enlazar controller con service
	@Inject
	private IOfertaService oService;

	@Inject
	private IPlatoService plService;

	@Inject
	private IRestauranteService reService;
	
	// variables
	private Oferta o;
	List<Oferta> listaOfertas;
	List<Plato> listaPlatos;
	List<Restaurante> listaRestaurantes;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaOfertas = new ArrayList<Oferta>();
		this.o = new Oferta();
		this.listaPlatos = new ArrayList<Plato>();
		this.listaRestaurantes = new ArrayList<Restaurante>();
		
		this.listPlatos();
		this.listRestaurantes();
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
			System.out.println("Error al insertar en el controller de oferta");
		}

	}

	public void list() {
		try {
			listaOfertas = oService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de oferta");
		}
	}

	public void listPlatos() {
		try {
			listaPlatos = plService.list();
		} catch (Exception e) {
			System.out.println("Error al listar platos en controlador de oferta");
		}

	}

	public void listRestaurantes() {
		try {
			listaRestaurantes = reService.list();
		} catch (Exception e) {
			System.out.println("Error al listar restaurantes en controlador de oferta");
		}

	}
	
	public void delete(Oferta ofer) {
		try {
			oService.delete(ofer.getIdOferta());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de oferta");
		}
	}

	// update
		public String preUpdate(Oferta o) {
			this.setO(o);
			return "modificacionoferta.xhtml";
		}

		public void update() {

			try {
				oService.update(this.o);
			} catch (Exception e) {
				System.out.println("Error al modificar el controlador de oferta");
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
