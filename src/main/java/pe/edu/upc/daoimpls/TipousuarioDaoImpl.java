package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ITipousuarioDao;
import pe.edu.upc.entities.Tipousuario;

public class TipousuarioDaoImpl implements ITipousuarioDao {
	@PersistenceContext(unitName = "SafetyFood1")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Tipousuario p) {
		try {
			em.persist(p);
		} catch (Exception e) {
			System.out.println("Error al insertar en Tipousuario dao!!");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tipousuario> list() {
		List<Tipousuario> listaTipousuarios = new ArrayList<Tipousuario>();
		try {
			Query jpql = em.createQuery("from Tipousuario p");
			listaTipousuarios = (List<Tipousuario>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar Tipousuario en el dao!!");
		}
		return listaTipousuarios;
	}

	@Transactional
	@Override
	public void delete(int idTipousuario) {
		try {
			Tipousuario per = em.find(Tipousuario.class, idTipousuario);
			em.remove(per);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao de Tipousuario");
		}

	}

}