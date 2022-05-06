package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IPlatoDao;
import pe.edu.upc.entities.Plato;
import pe.edu.upc.serviceinterfaces.IPlatoService;

@Named
public class PlatoServiceImpl implements IPlatoService {
	@Inject
	private IPlatoDao plDao;

	public void insert(Plato pl) {
		plDao.insert(pl);
	}

	public List<Plato> list() {
		// TODO Auto-generated method stub
		return plDao.list();
	}
	
	@Override
	public void delete(int idPlato) {
		// TODO Auto-generated method stub
		plDao.delete(idPlato);
		
	}
}
