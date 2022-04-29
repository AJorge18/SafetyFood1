package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ITipousuarioDao;
import pe.edu.upc.entities.Tipousuario;
import pe.edu.upc.serviceinterfaces.ITipousuarioService;

@Named
public class TipousuarioServiceImpl implements ITipousuarioService {
	@Inject
	private ITipousuarioDao pDao;

	public void insert(Tipousuario p) {
		pDao.insert(p);
	}

	public List<Tipousuario> list() {
		// TODO Auto-generated method stub
		return pDao.list();
	}
	
	@Override
	public void delete(int idTipousuario) {
		// TODO Auto-generated method stub
		pDao.delete(idTipousuario);
		
	}
}
