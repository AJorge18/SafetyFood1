package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Oferta")
public class Oferta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idOferta;
	
	@Column(name = "nombreoferta", nullable = false,length = 47)
	private String nombreoferta;
	
	@Column(name = "precioantes", nullable = false,length = 46)
	private String precioantes;
	
	@Column(name = "precioactual", nullable = false,length = 45)
	private String precioactual;
	
	@Column(name = "imagenoferta", nullable = false,length = 44)
	private String imagenoferta;
	



	public Oferta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Oferta(int idOferta, String nombreoferta, String precioantes, String precioactual, String imagenoferta) {
		super();
		this.idOferta = idOferta;
		this.nombreoferta = nombreoferta;
		this.precioantes = precioantes;
		this.precioactual = precioactual;
		this.imagenoferta = imagenoferta;
		

	}

	public int getIdOferta() {
		return idOferta;
	}

	public void setIdOferta(int idOferta) {
		this.idOferta = idOferta;
	}

	public String getNombreoferta() {
		return nombreoferta;
	}

	public void setNombreoferta(String nombreoferta) {
		this.nombreoferta = nombreoferta;
	}
	
	public String getPrecioantes() {
		return precioantes;
	}

	public void setPrecioantes(String precioantes) {
		this.precioantes = precioantes;
	}
	
	public String getPrecioactual() {
		return precioactual;
	}

	public void setPrecioactual(String precioactual) {
		this.precioactual = precioactual;
	}
	
	public String getImagenoferta() {
		return imagenoferta;
	}

	public void setImagenoferta(String imagenoferta) {
		this.imagenoferta = imagenoferta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idOferta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oferta other = (Oferta) obj;
		return idOferta == other.idOferta;
	}
	


}
