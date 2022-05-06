package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;	

@Entity
@Table(name = "Cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCliente;
	
	@Column(name = "nombrecliente", nullable = false,length = 47)
	private String nombrecliente;
	
	@Column(name = "apellidocliente", nullable = false,length = 46)
	private String apellidocliente;
	
	@Column(name = "dnicliente", nullable = false,length = 45)
	private String dnicliente;
	
	@Column(name = "correocliente", nullable = false,length = 44)
	private String correocliente;
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int idCliente, String nombrecliente, String apellidocliente, String dnicliente, String correocliente) {
		super();
		this.idCliente = idCliente;
		this.nombrecliente = nombrecliente;
		this.apellidocliente = apellidocliente;
		this.dnicliente = dnicliente;
		this.correocliente = correocliente;
		
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public String getApellidocliente() {
		return apellidocliente;
	}

	public void setApellidocliente(String apellidocliente) {
		this.apellidocliente = apellidocliente;
	}

	public String getDnicliente() {
		return dnicliente;
	}

	public void setDnicliente(String dnicliente) {
		this.dnicliente = dnicliente;
	}

	public String getCorreocliente() {
		return correocliente;
	}

	public void setCorreocliente(String correocliente) {
		this.correocliente = correocliente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return idCliente == other.idCliente;
	}

}
