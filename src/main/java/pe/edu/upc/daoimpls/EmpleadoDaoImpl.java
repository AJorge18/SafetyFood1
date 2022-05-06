package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IEmpleadoDao;
import pe.edu.upc.entities.Empleado;

public class EmpleadoDaoImpl implements IEmpleadoDao {
	@PersistenceContext(unitName = "demosafetyfood")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Empleado ep) {
		try {
			em.persist(ep);
		} catch (Exception e) {
			System.out.println("Error al insertar en empleado dao!!");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Empleado> list() {
		List<Empleado> listaEmpleados = new ArrayList<Empleado>();
		try {
			Query jpql = em.createQuery("from Empleado ep");
			listaEmpleados = (List<Empleado>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar empleado en el dao!!");
		}
		return listaEmpleados;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Empleado> findByName(Empleado ep) {
		List<Empleado> listaBuscada2 = new ArrayList<Empleado>();
		try {
			Query q = em.createQuery("from Empleado ep where ep.nombreempleado like ?1");
			q.setParameter(1, "%" + ep.getNombreempleado() + "%");
			listaBuscada2 = (List<Empleado>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al buscar empleado");
		}
		return listaBuscada2;
	}
	
	@Transactional
	@Override
	public void delete(int idEmpleado) {
		try {
			Empleado epl = em.find(Empleado.class, idEmpleado);
			em.remove(epl);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao de empleado");
		}

	}
	
	@Transactional
	@Override
	public void update(Empleado ep) {
		try {
			em.merge(ep);
		} catch (Exception e) {
			System.out.println("Error al modificar empleado en el dao");
		}
}
	

}