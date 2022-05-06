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
@Table(name = "Calificacion")
public class Calificacion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCalificacion;

	@ManyToOne
	@JoinColumn(name = "idCliente", nullable = false)
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "idRestaurante", nullable = false)
	private Restaurante restaurante;

	@Column(name = "puntuacion", nullable = false)
	private int puntuacion;

	@Column(name = "resena", nullable = false)
	private String resena;

	
	public Calificacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calificacion(int idCalificacion, Cliente cliente, Restaurante restaurante, int puntuacion, String resena) {
		super();
		this.idCalificacion = idCalificacion;
		this.cliente = cliente;
		this.restaurante = restaurante;
		this.puntuacion = puntuacion;
		this.resena = resena;
	

	}

	public int getIdCalificacion() {
		return idCalificacion;
	}

	public void setIdCalificacion(int idCalificacion) {
		this.idCalificacion = idCalificacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getResena() {
		return resena;
	}

	public void setResena(String resena) {
		this.resena = resena;
	}

	

}
