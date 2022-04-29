package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Restaurante;

public interface IRestauranteService {
	
	public void insert(Restaurante re);

	public List<Restaurante> list();

	public void delete(int idRestaurante);
	
	

}
