package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Cliente;

import pe.edu.upc.serviceinterfaces.IClienteService;

@Named
@RequestScoped
public class ClienteController {
	// enlazar controller con service
	@Inject
	private IClienteService clService;

	// variables
	private Cliente cl;
	List<Cliente> listaClientes;

	// Constructor
	@PostConstruct
	public void init() {
		this.listaClientes = new ArrayList<Cliente>();
		this.cl = new Cliente();
		this.list();
	}

	public String newCliente() {
		this.setCl(new Cliente());
		return "cliente.xhtml";
	}

	public void insert() {
		try {
			clService.insert(cl);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de cliente");
		}

	}

	public void list() {
		try {
			listaClientes = clService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de cliente");
		}
	}

	public void delete(Cliente clie) {
		try {
			clService.delete(clie.getIdCliente());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de cliente");
		}
	}
	
	//update
			public String preUpdate(Cliente cl) {
				this.setCl(cl);
				return "modificacioncliente.xhtml";
			}
			
			public void update() {
				
				try {
					clService.update(this.cl);
				} catch (Exception e) {
					System.out.println("Error al modificar el controlador de cliente");
				}
			}
		
	

	public Cliente getCl() {
		return cl;
	}

	public void setCl(Cliente cl) {
		this.cl = cl;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

}
