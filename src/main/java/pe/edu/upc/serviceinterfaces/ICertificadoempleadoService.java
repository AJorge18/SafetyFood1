package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Certificadoempleado;

public interface ICertificadoempleadoService {
	public void insert(Certificadoempleado p);

	public List<Certificadoempleado> list();
	
	public void delete(int idCertificadoempleado );
}
