package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IRestauranteDao;
import pe.edu.upc.entities.Restaurante;
import pe.edu.upc.serviceinterfaces.IRestauranteService;

@Named
public class RestauranteServiceImpl implements IRestauranteService{

	@Inject
	private IRestauranteDao reDao;
	
	@Override
	public void insert(Restaurante re) {
		reDao.insert(re);
		
	}

	@Override
	public List<Restaurante> list() {
		// TODO Auto-generated method stub
				return reDao.list();
	}

	@Override
	public void delete(int idRestaurante) {
		// TODO Auto-generated method stub
				reDao.delete(idRestaurante);
		
	}

	
	
	

}
