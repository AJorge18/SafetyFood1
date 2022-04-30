package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Certificadominsalud;

public interface ICertificadominsaludService {
	public void insert(Certificadominsalud p);

	public List<Certificadominsalud> list();
	
	public void delete(int idCertificadominsalud );
}

