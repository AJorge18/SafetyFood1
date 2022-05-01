package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ITiporestauranteDao;
import pe.edu.upc.entities.Tiporestaurante;

public class TiporestauranteDaoImpl implements ITiporestauranteDao {
	@PersistenceContext(unitName = "SafetyFood1")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Tiporestaurante tr) {
		try {
			em.persist(tr);
		} catch (Exception e) {
			System.out.println("Error al insertar en tipo dao!!");
		}
	}

	@SuppressWarnings("unchecked")
	public List<Tiporestaurante> list() {
		List<Tiporestaurante> listaTiporestaurantes = new ArrayList<Tiporestaurante>();
		try {
			Query jpql = em.createQuery("from Tiporestaurante tr");
			listaTiporestaurantes = (List<Tiporestaurante>) jpql.getResultList();

		} catch (Exception e) {
			System.out.println("Error al listar tipo en el dao!!");
		}
		return listaTiporestaurantes;
	}

	@Transactional
	@Override
	public void delete(int idTiporestaurante) {
		try {
			Tiporestaurante ter = em.find(Tiporestaurante.class, idTiporestaurante);
			em.remove(ter);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao de persona");
		}

	}
}