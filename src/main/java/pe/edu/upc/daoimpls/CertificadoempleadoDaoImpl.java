package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ICertificadoempleadoDao;
import pe.edu.upc.entities.Certificadoempleado;

public class CertificadoempleadoDaoImpl implements ICertificadoempleadoDao {
	@PersistenceContext(unitName = "demosafetyfood")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Certificadoempleado p) {
		try {
			em.persist(p);
		} catch (Exception e) {
			System.out.println("Error al insertar en departamento dao!!");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Certificadoempleado> list() {
		List<Certificadoempleado> listaCertificadoempleados = new ArrayList<Certificadoempleado>();
		try {
			Query jpql = em.createQuery("from Certificadoempleado p");
			listaCertificadoempleados = (List<Certificadoempleado>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar departamento en el dao!!");
		}
		return listaCertificadoempleados;
	}
	
	@Transactional
	@Override
	public void delete(int idCertificadoempleado) {
		try {
			Certificadoempleado per = em.find(Certificadoempleado.class, idCertificadoempleado);
			em.remove(per);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao de persona");
		}

	}

}