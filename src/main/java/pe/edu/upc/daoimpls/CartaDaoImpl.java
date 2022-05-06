package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ICartaDao;
import pe.edu.upc.entities.Carta;

public class CartaDaoImpl implements ICartaDao {
	@PersistenceContext(unitName = "demosafetyfood")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Carta ca) {
		try {
			em.persist(ca);
		} catch (Exception e) {
			System.out.println("Error al insertar en carta dao!!");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Carta> list() {
		List<Carta> listaCartas = new ArrayList<Carta>();
		try {
			Query jpql = em.createQuery("from Carta ca");
			listaCartas = (List<Carta>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar carta en el dao!!");
		}
		return listaCartas;
	}
	
	
	
	@Transactional
	@Override
	public void delete(int idCarta) {
		try {
			Carta car = em.find(Carta.class, idCarta);
			em.remove(car);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao de carta");
		}

	}

	@Transactional
	@Override
	public void update(Carta ca) {
		try {
			em.merge(ca);
		} catch (Exception e) {
			System.out.println("Error al modificar carta en el dao");
		}
}
	
}