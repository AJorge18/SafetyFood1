package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Empleado;

public interface IEmpleadoDao {
	public void insert(Empleado ep);

	public List<Empleado> list();

	public void delete(int idEmpleado);
	
	public void update(Empleado ep);
	
	public List<Empleado> findByName(Empleado ep);
}
