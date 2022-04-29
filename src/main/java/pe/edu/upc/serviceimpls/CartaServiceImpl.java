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
	private ICartaDao caDao;

	public void insert(Carta ca) {
		caDao.insert(ca);
	}

	public List<Carta> list() {
		// TODO Auto-generated method stub
		return caDao.list();
	}
	
	@Override
	public void delete(int idCarta) {
		// TODO Auto-generated method stub
		caDao.delete(idCarta);
		
	}
}
