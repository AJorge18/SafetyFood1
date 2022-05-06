package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IEmpleadoDao;
import pe.edu.upc.entities.Empleado;
import pe.edu.upc.serviceinterfaces.IEmpleadoService;

@Named
public class EmpleadoServiceImpl implements IEmpleadoService {
	@Inject
	private IEmpleadoDao epDao;

	public void insert(Empleado ep) {
		epDao.insert(ep);
	}

	public List<Empleado> list() {
		// TODO Auto-generated method stub
		return epDao.list();
	}
	
	@Override
	public void delete(int idEmpleado) {
		// TODO Auto-generated method stub
		epDao.delete(idEmpleado);
		
	}
	
	@Override
	public void update(Empleado ep) {
		// TODO Auto-generated method stub
		epDao.update(ep);
		
	}
	
	@Override
	public List<Empleado> findByName(Empleado ep) {
		// TODO Auto-generated method stub
				return epDao.findByName(ep);
	}
	
}
