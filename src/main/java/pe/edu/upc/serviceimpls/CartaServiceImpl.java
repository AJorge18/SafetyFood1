package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ICartaDao;
import pe.edu.upc.entities.Carta;
import pe.edu.upc.serviceinterfaces.ICartaService;

@Named
public class CartaServiceImpl implements ICartaService {
	@Inject
	private ICartaDao pDao;

	public void insert(Carta p) {
		pDao.insert(p);
	}

	public List<Carta> list() {
		// TODO Auto-generated method stub
		return pDao.list();
	}
	
	@Override
	public void delete(int idCarta) {
		// TODO Auto-generated method stub
		pDao.delete(idCarta);
		
	}
}
