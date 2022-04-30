package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ICertificadominsaludDao;
import pe.edu.upc.entities.Certificadominsalud;

public class CertificadominsaludDaoImpl implements ICertificadominsaludDao {
	@PersistenceContext(unitName = "demosafetyfood")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Certificadominsalud p) {
		try {
			em.persist(p);
		} catch (Exception e) {
			System.out.println("Error al insertar en departamento dao!!");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Certificadominsalud> list() {
		List<Certificadominsalud> listaCertificadominsaluds = new ArrayList<Certificadominsalud>();
		try {
			Query jpql = em.createQuery("from Certificadominsalud p");
			listaCertificadominsaluds = (List<Certificadominsalud>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar departamento en el dao!!");
		}
		return listaCertificadominsaluds;
	}
	
	@Transactional
	@Override
	public void delete(int idCertificadominsalud) {
		try {
			Certificadominsalud per = em.find(Certificadominsalud.class, idCertificadominsalud);
			em.remove(per);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao de persona");
		}

	}

}