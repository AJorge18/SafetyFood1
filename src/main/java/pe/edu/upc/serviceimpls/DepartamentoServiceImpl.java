package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IDepartamentoDao;
import pe.edu.upc.entities.Departamento;
import pe.edu.upc.serviceinterfaces.IDepartamentoService;

@Named
public class DepartamentoServiceImpl implements IDepartamentoService {
	@Inject
	private IDepartamentoDao deDao;

	public void insert(Departamento de) {
		deDao.insert(de);
	}

	public List<Departamento> list() {
		// TODO Auto-generated method stub
		return deDao.list();
	}
	
	@Override
	public void delete(int idDepartamento) {
		// TODO Auto-generated method stub
		deDao.delete(idDepartamento);
		
	}
}
