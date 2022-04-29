package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Distrito;

public interface IDistritoService {
	public void insert(Distrito di);

	public List<Distrito> list();
	
	public void delete(int idDistrito );
}
