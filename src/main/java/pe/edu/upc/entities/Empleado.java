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
@Table(name = "Empleado")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idEmpleado;
	
	@ManyToOne
	@JoinColumn(name = "idTipocertificado", nullable = false)
	private Tipocertificado tipocertificado;
	
	@ManyToOne
	@JoinColumn(name = "idRestaurante", nullable = false)
	private Restaurante restaurante;
	
	@Column(name = "nombreempleado", nullable = false)
	private String nombreempleado;
	
	@Column(name = "apellidoempleado", nullable = false)
	private String apellidoempleado;
	
	@Column(name = "dniempleado",  nullable = false)
	private String dniempleado;
	
	@Column(name = "correoempleado",  nullable = false)
	private String correoempleado;
	



	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(int idEmpleado, Tipocertificado tipocertificado, Restaurante restaurante, String nombreempleado, String apellidoempleado, String dniempleado, String correoempleado) {
		super();
		this.idEmpleado = idEmpleado;
		this.tipocertificado = tipocertificado;
		this.restaurante = restaurante;
		this.nombreempleado = nombreempleado;
		this.apellidoempleado = apellidoempleado;
		this.dniempleado = dniempleado;
		this.correoempleado = correoempleado;
		

	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Tipocertificado getTipocertificado() {
		return tipocertificado;
	}

	public void setTipocertificado(Tipocertificado tipocertificado) {
		this.tipocertificado = tipocertificado;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	public String getNombreempleado() {
		return nombreempleado;
	}

	public void setNombreempleado(String nombreempleado) {
		this.nombreempleado = nombreempleado;
	}

	public String getApellidoempleado() {
		return apellidoempleado;
	}

	public void setApellidoempleado(String apellidoempleado) {
		this.apellidoempleado = apellidoempleado;
	}

	public String getDniempleado() {
		return dniempleado;
	}

	public void setDniempleado(String dniempleado) {
		this.dniempleado = dniempleado;
	}

	public String getCorreoempleado() {
		return correoempleado;
	}

	public void setCorreoempleado(String correoempleado) {
		this.correoempleado = correoempleado;
	}

	


}
