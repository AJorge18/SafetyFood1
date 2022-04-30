package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tipocertificado")
public class Tipocertificado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTipocertificado;
	
	@Column(name = "tipocertificado", nullable = false,length = 47)
	private String tipocertificado;
	
	@Column(name = "nombretipocertificado", nullable = false,length = 46)
	private String nombretipocertificado;
	
	
	public Tipocertificado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tipocertificado(int idTipocertificado, String tipocertificado, String nombretipocertificado) {
		super();
		this.idTipocertificado = idTipocertificado;
		this.tipocertificado = tipocertificado;
		this.nombretipocertificado = nombretipocertificado;
		
	}

	public int getIdTipocertificado() {
		return idTipocertificado;
	}

	public void setIdTipocertificado(int idTipocertificado) {
		this.idTipocertificado = idTipocertificado;
	}

	public String getTipocertificado() {
		return tipocertificado;
	}

	public void setTipocertificado(String tipocertificado) {
		this.tipocertificado = tipocertificado;
	}

	public String getNombretipocertificado() {
		return nombretipocertificado;
	}

	public void setNombretipocertificado(String nombretipocertificado) {
		this.nombretipocertificado = nombretipocertificado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idTipocertificado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tipocertificado other = (Tipocertificado) obj;
		return idTipocertificado == other.idTipocertificado;
	}

	
	
	
	

}
