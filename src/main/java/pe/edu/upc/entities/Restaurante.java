package pe.edu.upc.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Restaurante")
public class Restaurante {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRestaurante;
	
	@ManyToOne
	@JoinColumn(name = "idTipocertificado", nullable = false)
	private Tipocertificado tipocertificado;
	
	@ManyToOne
	@JoinColumn(name = "idTiporestaurante", nullable = false)
	private Tiporestaurante tiporestaurante;
	
	@ManyToOne
	@JoinColumn(name = "idDistrito", nullable = false)
	private Distrito distrito;
	
	@ManyToOne
	@JoinColumn(name = "idDepartamento", nullable = false)
	private Departamento departamento;
	
	@ManyToOne
	@JoinColumn(name = "idOferta", nullable = false)
	private Oferta oferta;
	
	

	public Restaurante() {
		super();
		// TODO  Auto-generated constructor stub
	}
	
	public Restaurante(int idRestaurante, Tipocertificado tipocertificado, Tiporestaurante tiporestaurante, Distrito distrito, Departamento departamento, Oferta oferta ) {
		super();
		this.idRestaurante = idRestaurante;
		this.tipocertificado = tipocertificado;
		this.tiporestaurante = tiporestaurante;
		this.distrito = distrito;
		this.departamento = departamento;
		this.oferta = oferta;
	}
	
	

	//getters && setters
	public int getIdRestaurante() {
		return idRestaurante;
	}

	public void setIdRestaurante(int idRestaurante) {
		this.idRestaurante = idRestaurante;
	}

	public Tipocertificado getTipocertificado() {
		return tipocertificado;
	}

	public void setTipocertificado(Tipocertificado tipocertificado) {
		this.tipocertificado = tipocertificado;
	}

	public Tiporestaurante getTiporestaurante() {
		return tiporestaurante;
	}

	public void setTiporestaurante(Tiporestaurante tiporestaurante) {
		this.tiporestaurante = tiporestaurante;
	}
	
	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public Oferta getOferta() {
		return oferta;
	}

	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
	}
	
}
