package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ICalificacionDao;
import pe.edu.upc.entities.Calificacion;

public class CalificacionDaoImpl implements ICalificacionDao {
	@PersistenceContext(unitName = "SafetyFood1")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Calificacion li) {
		try {
			em.persist(li);
		} catch (Exception e) {
			System.out.println("Error al insertar en calificacion dao!!");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Calificacion> list() {
		List<Calificacion> listaCalificacions = new ArrayList<Calificacion>();
		try {
			Query jpql = em.createQuery("from Calificacion li");
			listaCalificacions = (List<Calificacion>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar calificacion en el dao!!");
		}
		return listaCalificacions;
	}
	
	@Transactional
	@Override
	public void delete(int idCalificacion) {
		try {
			Calificacion cal = em.find(Calificacion.class, idCalificacion);
			em.remove(cal);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao de calificacion");
		}

	}
	
	@Transactional
	@Override
	public void update(Calificacion li) {
		try {
			em.merge(li);
		} catch (Exception e) {
			System.out.println("Error al modificar calificacion en el dao");
		}
}
	

}