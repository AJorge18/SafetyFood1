package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Plato")
public class Plato {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPlato;
	
	@Column(name = "nombreplato", nullable = false,length = 47)
	private String nombreplato;

	public Plato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plato(int idPlato, String nombreplato) {
		super();
		this.idPlato = idPlato;
		this.nombreplato = nombreplato;

	}

	public int getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}

	public String getNombreplato() {
		return nombreplato;
	}

	public void setNombreplato(String nombreplato) {
		this.nombreplato = nombreplato;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPlato);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plato other = (Plato) obj;
		return idPlato == other.idPlato;
	}

	


}
