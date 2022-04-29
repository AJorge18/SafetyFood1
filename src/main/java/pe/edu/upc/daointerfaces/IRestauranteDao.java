package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Restaurante;

public interface IRestauranteDao {
	
	public void insert(Restaurante re);
	public List<Restaurante> list();
	void delete(int idRestaurante);
	


}
