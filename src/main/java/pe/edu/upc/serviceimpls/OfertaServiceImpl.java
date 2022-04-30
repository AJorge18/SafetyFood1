package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IOfertaDao;
import pe.edu.upc.entities.Oferta;
import pe.edu.upc.serviceinterfaces.IOfertaService;

@Named
public class OfertaServiceImpl implements IOfertaService {
	@Inject
	private IOfertaDao oDao;

	public void insert(Oferta o) {
		oDao.insert(o);
	}

	public List<Oferta> list() {
		// TODO Auto-generated method stub
		return oDao.list();
	}
	
	@Override
	public void delete(int idOferta) {
		// TODO Auto-generated method stub
		oDao.delete(idOferta);
		
	}
}
