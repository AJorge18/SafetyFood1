package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Distrito;

public interface IDistritoDao {
	public void insert(Distrito p);

	public List<Distrito> list();

	public void delete(int idDistrito);
}
