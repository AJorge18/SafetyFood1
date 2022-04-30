package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Certificadominsalud;

public interface ICertificadominsaludDao {
	public void insert(Certificadominsalud p);

	public List<Certificadominsalud> list();
	
	public void delete(int idCertificadominsalud);
}
