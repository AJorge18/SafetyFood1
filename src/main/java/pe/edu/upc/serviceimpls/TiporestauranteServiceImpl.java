package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ITiporestauranteDao;
import pe.edu.upc.entities.Tiporestaurante;
import pe.edu.upc.serviceinterfaces.ITiporestauranteService;

@Named
public class TiporestauranteServiceImpl implements ITiporestauranteService {
	@Inject
	private ITiporestauranteDao trDao;

	public void insert(Tiporestaurante tr) {
		trDao.insert(tr);
	}

	public List<Tiporestaurante> list() {
		// TODO Auto-generated method stub
		return trDao.list();
	}
	
	@Override
	public void delete(int idTiporestaurante) {
		// TODO Auto-generated method stub
		trDao.delete(idTiporestaurante);
		
	}
}
