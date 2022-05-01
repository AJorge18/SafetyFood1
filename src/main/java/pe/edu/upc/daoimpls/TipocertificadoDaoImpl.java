package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ITipocertificadoDao;
import pe.edu.upc.entities.Tipocertificado;

public class TipocertificadoDaoImpl implements ITipocertificadoDao {
	@PersistenceContext(unitName = "SafetyFood1")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Tipocertificado t) {
		try {
			em.persist(t);
		} catch (Exception e) {
			System.out.println("Error al insertar en tipo dao!!");
		}
	}

	@SuppressWarnings("unchecked")
	public List<Tipocertificado> list() {
		List<Tipocertificado> listaTipocertificados = new ArrayList<Tipocertificado>();
		try {
			Query jpql = em.createQuery("from Tipocertificado t");
			listaTipocertificados = (List<Tipocertificado>) jpql.getResultList();

		} catch (Exception e) {
			System.out.println("Error al listar tipo en el dao!!");
		}
		return listaTipocertificados;
	}

	@Transactional
	@Override
	public void delete(int idTipocertificado) {
		try {
			Tipocertificado ter = em.find(Tipocertificado.class, idTipocertificado);
			em.remove(ter);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao de persona");
		}

	}
}