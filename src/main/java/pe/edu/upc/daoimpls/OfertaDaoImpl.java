package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IOfertaDao;
import pe.edu.upc.entities.Oferta;

public class OfertaDaoImpl implements IOfertaDao {
	@PersistenceContext(unitName = "demosafetyfood")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Oferta o) {
		try {
			em.persist(o);
		} catch (Exception e) {
			System.out.println("Error al insertar en departamento dao!!");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Oferta> list() {
		List<Oferta> listaOfertas = new ArrayList<Oferta>();
		try {
			Query jpql = em.createQuery("from Oferta o");
			listaOfertas = (List<Oferta>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar departamento en el dao!!");
		}
		return listaOfertas;
	}
	
	@Transactional
	@Override
	public void delete(int idOferta) {
		try {
			Oferta ofe = em.find(Oferta.class, idOferta);
			em.remove(ofe);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao de persona");
		}

	}

}