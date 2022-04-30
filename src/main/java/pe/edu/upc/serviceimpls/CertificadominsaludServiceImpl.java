package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ICertificadominsaludDao;
import pe.edu.upc.entities.Certificadominsalud;
import pe.edu.upc.serviceinterfaces.ICertificadominsaludService;

@Named
public class CertificadominsaludServiceImpl implements ICertificadominsaludService {
	@Inject
	private ICertificadominsaludDao pDao;

	public void insert(Certificadominsalud p) {
		pDao.insert(p);
	}

	public List<Certificadominsalud> list() {
		// TODO Auto-generated method stub
		return pDao.list();
	}
	
	@Override
	public void delete(int idCertificadominsalud) {
		// TODO Auto-generated method stub
		pDao.delete(idCertificadominsalud);
		
	}
}
