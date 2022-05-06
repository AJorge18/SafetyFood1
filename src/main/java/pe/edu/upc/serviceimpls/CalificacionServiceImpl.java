package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ICalificacionDao;
import pe.edu.upc.entities.Calificacion;
import pe.edu.upc.serviceinterfaces.ICalificacionService;

@Named
public class CalificacionServiceImpl implements ICalificacionService {
	@Inject
	private ICalificacionDao liDao;

	public void insert(Calificacion li) {
		liDao.insert(li);
	}

	public List<Calificacion> list() {
		// TODO Auto-generated method stub
		return liDao.list();
	}
	
	@Override
	public void delete(int idCalificacion) {
		// TODO Auto-generated method stub
		liDao.delete(idCalificacion);
		
	}
	
	@Override
	public void update(Calificacion li) {
		// TODO Auto-generated method stub
		liDao.update(li);
		
	}
}
