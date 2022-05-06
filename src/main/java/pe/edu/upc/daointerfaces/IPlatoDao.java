package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Plato;

public interface IPlatoDao {
	public void insert(Plato pl);

	public List<Plato> list();

	public void delete(int idPlato);
}
