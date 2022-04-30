package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ICertificadoempleadoDao;
import pe.edu.upc.entities.Certificadoempleado;
import pe.edu.upc.serviceinterfaces.ICertificadoempleadoService;

@Named
public class CertificadoempleadoServiceImpl implements ICertificadoempleadoService {
	@Inject
	private ICertificadoempleadoDao pDao;

	public void insert(Certificadoempleado p) {
		pDao.insert(p);
	}

	public List<Certificadoempleado> list() {
		// TODO Auto-generated method stub
		return pDao.list();
	}
	
	@Override
	public void delete(int idCertificadoempleado) {
		// TODO Auto-generated method stub
		pDao.delete(idCertificadoempleado);
		
	}
}
