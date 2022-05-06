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
@Table(name = "Oferta")
public class Oferta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idOferta;
	
	@ManyToOne
	@JoinColumn(name = "idPlato", nullable = false)
	private Plato plato;
	
	@ManyToOne
	@JoinColumn(name = "idRestaurante", nullable = false)
	private Restaurante restaurante;
	
	@Column(name = "precioantes", nullable = false)
	private String precioantes;
	
	@Column(name = "precioactual", nullable = false)
	private String precioactual;
	
	@Column(name = "imagenoferta",  nullable = false)
	private String imagenoferta;
	



	public Oferta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Oferta(int idOferta, Plato plato, Restaurante restaurante, String precioantes, String precioactual, String imagenoferta) {
		super();
		this.idOferta = idOferta;
		this.plato = plato;
		this.restaurante = restaurante;
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

	


}
