package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IDistritoDao;
import pe.edu.upc.entities.Distrito;

public class DistritoDaoImpl implements IDistritoDao {
	@PersistenceContext(unitName = "SafetyFood1")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Distrito di) {
		try {
			em.persist(di);
		} catch (Exception e) {
			System.out.println("Error al insertar en departamento dao!!");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Distrito> list() {
		List<Distrito> listaDistritos = new ArrayList<Distrito>();
		try {
			Query jpql = em.createQuery("from Distrito di");
			listaDistritos = (List<Distrito>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar departamento en el dao!!");
		}
		return listaDistritos;
	}
	
	@Transactional
	@Override
	public void delete(int idDistrito) {
		try {
			Distrito dis = em.find(Distrito.class, idDistrito);
			em.remove(dis);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao de persona");
		}

	}

}