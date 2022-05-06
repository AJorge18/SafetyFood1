package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Calificacion;

public interface ICalificacionDao {
	public void insert(Calificacion li);

	public List<Calificacion> list();

	public void delete(int idCalificacion);
	
	public void update(Calificacion li);
}
