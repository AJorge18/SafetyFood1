package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tipousuario")
public class Tipousuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTipousuario;

	@Column(name = "tipousuario", nullable = false, length = 47)
	private String tipousuario;

	public Tipousuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tipousuario(int idTipousuario, String tipousuario) {
		super();
		this.idTipousuario = idTipousuario;
		this.tipousuario = tipousuario;

	}

	public int getIdTipousuario() {
		return idTipousuario;
	}

	public void setIdTipousuario(int idTipousuario) {
		this.idTipousuario = idTipousuario;
	}

	public String getTipousuario() {
		return tipousuario;
	}

	public void setTipousuario(String tipousuario) {
		this.tipousuario = tipousuario;
	}

}
