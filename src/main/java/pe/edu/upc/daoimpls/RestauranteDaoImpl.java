package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import javax.persistence.Query;
import pe.edu.upc.daointerfaces.IRestauranteDao;
import pe.edu.upc.entities.Restaurante;

public class RestauranteDaoImpl implements IRestauranteDao {

	@PersistenceContext(unitName = "SafetyFood1")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Restaurante re) {
		// TODO Auto-generated method stub
		try {
			em.persist(re);
		} catch (Exception e) {
			System.out.println("Error al insertar vacunación en el DAO");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Restaurante> list() {
		List<Restaurante> listaRestaurantes = new ArrayList<Restaurante>();
		try {
			Query jqpl = em.createQuery("from Restaurante va");
			listaRestaurantes = jqpl.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar restaurante en el DAO");
		}
		return listaRestaurantes;
	}

	@Transactional
	@Override
	public void delete(int idRestaurante) {
		try {
			Restaurante re = em.find(Restaurante.class, idRestaurante);
			em.remove(re);
		} catch (Exception e) {

			System.out.println("Error al eliminar en el dao");
		}
	}
	

}
