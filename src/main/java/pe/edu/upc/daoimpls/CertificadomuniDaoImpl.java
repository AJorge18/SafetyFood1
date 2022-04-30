package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ICertificadomuniDao;
import pe.edu.upc.entities.Certificadomuni;

public class CertificadomuniDaoImpl implements ICertificadomuniDao {
	@PersistenceContext(unitName = "demosafetyfood")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Certificadomuni p) {
		try {
			em.persist(p);
		} catch (Exception e) {
			System.out.println("Error al insertar en departamento dao!!");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Certificadomuni> list() {
		List<Certificadomuni> listaCertificadomunis = new ArrayList<Certificadomuni>();
		try {
			Query jpql = em.createQuery("from Certificadomuni p");
			listaCertificadomunis = (List<Certificadomuni>) jpql.getResultList();

		} catch (Exception e) {
			System.out.println("Error al listar departamento en el dao!!");
		}
		return listaCertificadomunis;
	}
	
	@Transactional
	@Override
	public void delete(int idCertificadomuni) {
		try {
			Certificadomuni per = em.find(Certificadomuni.class, idCertificadomuni);
			em.remove(per);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao de persona");
		}

	}

}