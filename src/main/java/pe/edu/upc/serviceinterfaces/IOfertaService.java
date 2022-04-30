package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Oferta;

public interface IOfertaService {
	public void insert(Oferta o);

	public List<Oferta> list();
	
	public void delete(int idOferta );
}
