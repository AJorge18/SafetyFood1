package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Tipousuario;

public interface ITipousuarioService {
	public void insert(Tipousuario p);

	public List<Tipousuario> list();
	
	public void delete(int idTipousuario );
}
