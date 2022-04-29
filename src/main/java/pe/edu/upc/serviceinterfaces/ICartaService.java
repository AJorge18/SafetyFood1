package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Carta;

public interface ICartaService {
	public void insert(Carta p);

	public List<Carta> list();
	
	public void delete(int idCarta );
}
