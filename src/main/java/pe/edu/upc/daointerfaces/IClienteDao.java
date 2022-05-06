package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Cliente;

public interface IClienteDao {
	public void insert(Cliente cl);

	public List<Cliente> list();
	
	
	public void delete(int idCliente);
	
	public void update(Cliente cl);
}
