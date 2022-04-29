package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Tiporestaurante;

public interface ITiporestauranteDao {
	public void insert(Tiporestaurante tr);

	public List<Tiporestaurante> list();
	
	public void delete(int idTiporestaurante);
}
