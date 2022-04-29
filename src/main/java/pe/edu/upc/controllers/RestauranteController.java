package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Tipocertificado;
import pe.edu.upc.entities.Restaurante;
import pe.edu.upc.entities.Tiporestaurante;
import pe.edu.upc.entities.Distrito;
import pe.edu.upc.entities.Departamento;
import pe.edu.upc.entities.Oferta;
import pe.edu.upc.serviceinterfaces.ITipocertificadoService;
import pe.edu.upc.serviceinterfaces.IRestauranteService;
import pe.edu.upc.serviceinterfaces.ITiporestauranteService;
import pe.edu.upc.serviceinterfaces.IDistritoService;
import pe.edu.upc.serviceinterfaces.IDepartamentoService;
import pe.edu.upc.serviceinterfaces.IOfertaService;

@Named
@RequestScoped
public class RestauranteController {
	@Inject
	private IRestauranteService reService;

	@Inject
	private ITipocertificadoService tService;

	@Inject
	private ITiporestauranteService trService;
	
	@Inject
	private IDistritoService diService;
	
	@Inject
	private IDepartamentoService deService;
	
	@Inject
	private IOfertaService oService;

	private Restaurante re;
	List<Restaurante> listaRestaurantes;
	List<Tipocertificado> listaTipocertificados;
	List<Tiporestaurante> listaTiporestaurantes;
	List<Distrito> listaDistritos;
	List<Departamento> listaDepartamentos;
	List<Oferta> listaOfertas;

	// constructor
	@PostConstruct
	public void init() {
		this.listaRestaurantes = new ArrayList<Restaurante>();
		this.re = new Restaurante();
		this.listaTipocertificados = new ArrayList<Tipocertificado>();
		this.listaTiporestaurantes = new ArrayList<Tiporestaurante>();
		this.listaDistritos = new ArrayList<Distrito>();
		this.listaDepartamentos = new ArrayList<Departamento>();
		this.listaOfertas = new ArrayList<Oferta>();
		
		this.listTipocertificados();
		this.listTiporestaurantes();
		this.listDistritos();
		this.listDepartamentos();
		this.listOfertas();
		this.list();
	}

	// métodos
	public String newRestaurante() {
		this.setRe(new Restaurante());
		return "restaurante.xhtml";
	}

	public void insert() {
		try {
			reService.insert(re);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controlador de vacunacion");
		}
	}

	public void list() {
		try {
			listaRestaurantes = reService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controlador de vacunacion");
		}
	}

	public void listTipocertificados() {
		try {
			listaTipocertificados = tService.list();
		} catch (Exception e) {
			System.out.println("Error al listar personas en controlador de vacunacion");
		}

	}

	public void listTiporestaurantes() {
		try {
			listaTiporestaurantes = trService.list();
		} catch (Exception e) {
			System.out.println("Error al listar vacunas en controlador de Vaccination");
		}

	}
	
	public void listDistritos() {
		try {
			listaDistritos = diService.list();
		} catch (Exception e) {
			System.out.println("Error al listar vacunas en controlador de Vaccination");
		}

	}
	
	public void listDepartamentos() {
		try {
			listaDepartamentos = deService.list();
		} catch (Exception e) {
			System.out.println("Error al listar vacunas en controlador de Vaccination");
		}

	}
	
	public void listOfertas() {
		try {
			listaOfertas = oService.list();
		} catch (Exception e) {
			System.out.println("Error al listar vacunas en controlador de Vaccination");
		}

	}

	public void delete(Restaurante re) {
		try {
			reService.delete(re.getIdRestaurante());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controlador de vacunation");
		}
	}
	

	/// getter
	public Restaurante getRe() {
		return re;
	}

	public void setRe(Restaurante re) {
		this.re = re;
	}

	public List<Restaurante> getListaRestaurantes() {
		return listaRestaurantes;
	}

	public void setListaRestaurantes(List<Restaurante> listaRestaurantes) {
		this.listaRestaurantes = listaRestaurantes;
	}

	public List<Tipocertificado> getListaTipocertificados() {
		return listaTipocertificados;
	}

	public void setListaTipocertificados(List<Tipocertificado> listaTipocertificados) {
		this.listaTipocertificados = listaTipocertificados;
	}

	public List<Tiporestaurante> getListaTiporestaurantes() {
		return listaTiporestaurantes;
	}

	public void setListaTiporestaurantes(List<Tiporestaurante> listaTiporestaurantes) {
		this.listaTiporestaurantes = listaTiporestaurantes;
	}

	public List<Distrito> getListaDistritos() {
		return listaDistritos;
	}

	public void setListaDistritos(List<Distrito> listaDistritos) {
		this.listaDistritos = listaDistritos;
	}

	public List<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}

	public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}
	
	public List<Oferta> getListaOfertas() {
		return listaOfertas;
	}

	public void setListaOfertas(List<Oferta> listaOfertas) {
		this.listaOfertas = listaOfertas;
	}
}
