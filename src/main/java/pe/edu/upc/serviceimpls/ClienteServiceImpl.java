package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IClienteDao;
import pe.edu.upc.entities.Cliente;
import pe.edu.upc.serviceinterfaces.IClienteService;

@Named
public class ClienteServiceImpl implements IClienteService {
	@Inject
	private IClienteDao clDao;

	public void insert(Cliente cl) {
		clDao.insert(cl);
	}

	public List<Cliente> list() {
		// TODO Auto-generated method stub
		return clDao.list();
	}
	
	@Override
	public void delete(int idCliente) {
		// TODO Auto-generated method stub
		clDao.delete(idCliente);
		
	}
	
	@Override
	public void update(Cliente cl) {
		// TODO Auto-generated method stub
		clDao.update(cl);
		
	}
	
}
