package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Distrito")
public class Distrito {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idDistrito;
	
	@Column(name = "nombredistrito", nullable = false,length = 47)
	private String nombredistrito;

	public Distrito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Distrito(int idDistrito, String nombredistrito) {
		super();
		this.idDistrito = idDistrito;
		this.nombredistrito = nombredistrito;

	}

	public int getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getNombredistrito() {
		return nombredistrito;
	}

	public void setNombredistrito(String nombredistrito) {
		this.nombredistrito = nombredistrito;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idDistrito);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Distrito other = (Distrito) obj;
		return idDistrito == other.idDistrito;
	}

}
