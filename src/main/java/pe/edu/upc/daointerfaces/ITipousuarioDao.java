package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Tipousuario;

public interface ITipousuarioDao {
	public void insert(Tipousuario p);

	public List<Tipousuario> list();
	
	public void delete(int idTipousuario);
}
