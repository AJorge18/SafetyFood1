package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Calificacion;

public interface ICalificacionService {
	public void insert(Calificacion li);

	public List<Calificacion> list();
	
	public void delete(int idCalificacion );
	
	public void update(Calificacion li);
}
