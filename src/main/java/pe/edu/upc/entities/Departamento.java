package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Departamento")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idDepartamento;
	
	@Column(name = "nombredepartamento", nullable = false,length = 47)
	private String nombredepartamento;
	
	
	public Departamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departamento(int idDepartamento, String nombredepartamento) {
		super();
		this.idDepartamento = idDepartamento;
		this.nombredepartamento = nombredepartamento;
		
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNombredepartamento() {
		return nombredepartamento;
	}

	public void setNombredepartamento(String nombredepartamento) {
		this.nombredepartamento = nombredepartamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idDepartamento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return idDepartamento == other.idDepartamento;
	}

	
	
	
	

}
