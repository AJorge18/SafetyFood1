package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Carta")
public class Carta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCarta;
	
	@ManyToOne
	@JoinColumn(name = "idPlato", nullable = false)
	private Plato plato;
	
	@ManyToOne
	@JoinColumn(name = "idRestaurante", nullable = false)
	private Restaurante restaurante;
	
	@Column(name = "preciocarta",  nullable = false)
	private String preciocarta;
	
	@Column(name = "imagencarta",  nullable = false)
	private String imagencarta;

	public Carta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carta(int idCarta, Plato plato, Restaurante restaurante, String preciocarta, String imagencarta) {
		super();
		this.idCarta = idCarta;
		this.plato = plato;
		this.restaurante = restaurante;
		this.preciocarta = preciocarta;
		this.imagencarta = imagencarta;

	}

	public int getIdCarta() {
		return idCarta;
	}

	public void setIdCarta(int idCarta) {
		this.idCarta = idCarta;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
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
