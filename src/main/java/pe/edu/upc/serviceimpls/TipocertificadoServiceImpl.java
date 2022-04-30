package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ITipocertificadoDao;
import pe.edu.upc.entities.Tipocertificado;
import pe.edu.upc.serviceinterfaces.ITipocertificadoService;

@Named
public class TipocertificadoServiceImpl implements ITipocertificadoService {
	@Inject
	private ITipocertificadoDao tDao;

	public void insert(Tipocertificado t) {
		tDao.insert(t);
	}

	public List<Tipocertificado> list() {
		// TODO Auto-generated method stub
		return tDao.list();
	}
	
	@Override
	public void delete(int idTipocertificado) {
		// TODO Auto-generated method stub
		tDao.delete(idTipocertificado);
		
	}
}
