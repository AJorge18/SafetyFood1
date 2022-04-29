package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Carta")
public class Carta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCarta;
	
	@Column(name = "nombrecarta", nullable = false,length = 47)
	private String nombrecarta;
	
	@Column(name = "preciocarta", nullable = false,length = 47)
	private String preciocarta;
	
	@Column(name = "imagencarta", nullable = false,length = 47)
	private String imagencarta;

	public Carta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carta(int idCarta, String nombrecarta, String preciocarta, String imagencarta) {
		super();
		this.idCarta = idCarta;
		this.nombrecarta = nombrecarta;
		this.preciocarta = preciocarta;
		this.imagencarta = imagencarta;

	}

	public int getIdCarta() {
		return idCarta;
	}

	public void setIdCarta(int idCarta) {
		this.idCarta = idCarta;
	}

	public String getNombrecarta() {
		return nombrecarta;
	}

	public void setNombrecarta(String nombrecarta) {
		this.nombrecarta = nombrecarta;
	}
	
	public String getPreciocarta() {
		return preciocarta;
	}

	public void setPreciocarta(String preciocarta) {
		this.preciocarta = preciocarta;
	}
	
	public String getImagencarta() {
		return imagencarta;
	}

	public void setImagencarta(String imagencarta) {
		this.imagencarta = imagencarta;
	}

}
