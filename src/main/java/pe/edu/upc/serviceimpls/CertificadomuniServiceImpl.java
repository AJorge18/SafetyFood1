package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ICertificadomuniDao;
import pe.edu.upc.entities.Certificadomuni;
import pe.edu.upc.serviceinterfaces.ICertificadomuniService;

@Named
public class CertificadomuniServiceImpl implements ICertificadomuniService {
	@Inject
	private ICertificadomuniDao pDao;

	public void insert(Certificadomuni p) {
		pDao.insert(p);
	}

	public List<Certificadomuni> list() {
		// TODO Auto-generated method stub
		return pDao.list();
	}
	
	@Override
	public void delete(int idCertificadomuni) {
		// TODO Auto-generated method stub
		pDao.delete(idCertificadomuni);
		
	}
}
