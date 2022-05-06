package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IPlatoDao;
import pe.edu.upc.entities.Plato;

public class PlatoDaoImpl implements IPlatoDao {
	@PersistenceContext(unitName = "SafetyFood1")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Plato pl) {
		try {
			em.persist(pl);
		} catch (Exception e) {
			System.out.println("Error al insertar en plato dao!!");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Plato> list() {
		List<Plato> listaPlatos = new ArrayList<Plato>();
		try {
			Query jpql = em.createQuery("from Plato pl");
			listaPlatos = (List<Plato>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar plato en el dao!!");
		}
		return listaPlatos;
	}
	
	@Transactional
	@Override
	public void delete(int idPlato) {
		try {
			Plato pla = em.find(Plato.class, idPlato);
			em.remove(pla);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao de plato");
		}

	}

}