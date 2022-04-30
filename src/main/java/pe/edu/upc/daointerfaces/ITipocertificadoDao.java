package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Tipocertificado;

public interface ITipocertificadoDao {
	public void insert(Tipocertificado t);

	public List<Tipocertificado> list();
	
	public void delete(int idTipocertificado);
}
