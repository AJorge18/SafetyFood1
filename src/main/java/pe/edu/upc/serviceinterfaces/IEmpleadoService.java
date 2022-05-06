package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Empleado;

public interface IEmpleadoService {
	public void insert(Empleado ep);

	public List<Empleado> list();
	

	
	public void delete(int idEmpleado );
	
	public void update(Empleado ep);
	
	public List<Empleado> findByName(Empleado ep);
}
