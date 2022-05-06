package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
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
	
	@Column(name = "nombrerestaurante", nullable = false)
	private String nombrerestaurante;
	
	@Column(name = "direccionrestaurante", nullable = false)
	private String direccionrestaurante;
	
	@Column(name = "aforototal", nullable = false)
	private int aforototal;
	
	@Column(name = "aforoactual", nullable = false)
	private int aforoactual;
	
	@Column(name = "numerorestaurante", nullable = false)
	private String numerorestaurante;
	
	@Column(name = "protocolo", nullable = false)
	private String protocolo;
	
	@Column(name = "estado", nullable = false)
	private String estado;
	

	public Restaurante() {
		super();
		// TODO  Auto-generated constructor stub
	}
	
	public Restaurante(int idRestaurante, Tipocertificado tipocertificado, Tiporestaurante tiporestaurante, Distrito distrito, Departamento departamento, String nombrerestaurante, String direccionrestaurante, int aforototal, int aforoactual, String numerorestaurante, String protocolo, String estado ) {
		super();
		this.idRestaurante = idRestaurante;
		this.tipocertificado = tipocertificado;
		this.tiporestaurante = tiporestaurante;
		this.distrito = distrito;
		this.departamento = departamento;
		this.nombrerestaurante = nombrerestaurante;
		this.direccionrestaurante = direccionrestaurante;
		this.aforototal = aforototal;
		this.aforoactual = aforoactual;
		this.numerorestaurante = numerorestaurante;
		this.protocolo = protocolo;
		this.estado = estado;
	}
	
	

	public String getNombrerestaurante() {
		return nombrerestaurante;
	}

	public void setNombrerestaurante(String nombrerestaurante) {
		this.nombrerestaurante = nombrerestaurante;
	}

	public String getDireccionrestaurante() {
		return direccionrestaurante;
	}

	public void setDireccionrestaurante(String direccionrestaurante) {
		this.direccionrestaurante = direccionrestaurante;
	}

	public int getAforototal() {
		return aforototal;
	}

	public void setAforototal(int aforototal) {
		this.aforototal = aforototal;
	}

	public int getAforoactual() {
		return aforoactual;
	}

	public void setAforoactual(int aforoactual) {
		this.aforoactual = aforoactual;
	}

	public String getNumerorestaurante() {
		return numerorestaurante;
	}

	public void setNumerorestaurante(String numerorestaurante) {
		this.numerorestaurante = numerorestaurante;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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

	@Override
	public int hashCode() {
		return Objects.hash(idRestaurante);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurante other = (Restaurante) obj;
		return idRestaurante == other.idRestaurante;
	}
	
	

	
}
