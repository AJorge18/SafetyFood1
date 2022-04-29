package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Carta;

public interface ICartaDao {
	public void insert(Carta p);

	public List<Carta> list();

	public void delete(int idCarta);
}
