package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Oferta;

public interface IOfertaDao {
	public void insert(Oferta o);

	public List<Oferta> list();

	public void delete(int idOferta);
	
	public void update(Oferta o);
	

}
