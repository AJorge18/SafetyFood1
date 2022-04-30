package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Tipocertificado;

public interface ITipocertificadoService {
	public void insert(Tipocertificado t);

	public List<Tipocertificado> list();
	
	public void delete(int idTipocertificado );
}
