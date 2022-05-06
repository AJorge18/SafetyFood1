package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Plato;

public interface IPlatoService {
	public void insert(Plato pl);

	public List<Plato> list();
	
	public void delete(int idPlato );
}
