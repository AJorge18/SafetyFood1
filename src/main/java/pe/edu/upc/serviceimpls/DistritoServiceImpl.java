package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IDistritoDao;
import pe.edu.upc.entities.Distrito;
import pe.edu.upc.serviceinterfaces.IDistritoService;

@Named
public class DistritoServiceImpl implements IDistritoService {
	@Inject
	private IDistritoDao diDao;

	public void insert(Distrito di) {
		diDao.insert(di);
	}

	public List<Distrito> list() {
		// TODO Auto-generated method stub
		return diDao.list();
	}
	
	@Override
	public void delete(int idDistrito) {
		// TODO Auto-generated method stub
		diDao.delete(idDistrito);
		
	}
}
