package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Certificadomuni;

public interface ICertificadomuniDao {
	public void insert(Certificadomuni p);

	public List<Certificadomuni> list();
	
	public void delete(int idCertificadomuni);
}
