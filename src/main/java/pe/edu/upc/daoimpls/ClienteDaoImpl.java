package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IClienteDao;
import pe.edu.upc.entities.Cliente;

public class ClienteDaoImpl implements IClienteDao {
	@PersistenceContext(unitName = "demosafetyfood")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Cliente cl) {
		try {
			em.persist(cl);
		} catch (Exception e) {
			System.out.println("Error al insertar en cliente dao!!");
		}
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> list() {
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		try {
			Query jpql = em.createQuery("from Cliente cl");
			listaClientes = (List<Cliente>) jpql.getResultList();

		} catch (Exception e) {
			System.out.println("Error al listar cliente en el dao!!");
		}
		return listaClientes;
	}

	@Transactional
	@Override
	public void delete(int idCliente) {
		try {
			Cliente ter = em.find(Cliente.class, idCliente);
			em.remove(ter);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao de cliente");
		}

	}
	@Transactional
	@Override
	public void update(Cliente cl) {
		try {
			em.merge(cl);
		} catch (Exception e) {
			System.out.println("Error al modificar cliente en el dao");
		}
}
	
}