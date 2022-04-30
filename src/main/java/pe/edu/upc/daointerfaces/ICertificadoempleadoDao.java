package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Certificadoempleado;

public interface ICertificadoempleadoDao {
	public void insert(Certificadoempleado p);

	public List<Certificadoempleado> list();

	public void delete(int idCertificadoempleado);
}
