package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Certificadomuni;

public interface ICertificadomuniService {
	public void insert(Certificadomuni p);

	public List<Certificadomuni> list();
	
	public void delete(int idCertificadomuni );
}
