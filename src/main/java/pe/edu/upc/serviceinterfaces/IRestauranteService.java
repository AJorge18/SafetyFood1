package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Restaurante;

public interface IRestauranteService {
	
	public void insert(Restaurante re);

	public List<Restaurante> list();
	
	public List<Restaurante> findByName(Restaurante re);

	public void delete(int idRestaurante);
	
	public void update(Restaurante re);

}
