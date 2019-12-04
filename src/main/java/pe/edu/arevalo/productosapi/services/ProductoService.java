package pe.edu.arevalo.productosapi.services;

import java.util.List;
import pe.edu.arevalo.productosapi.entities.Producto;

public interface ProductoService {
	
	public List<Producto> findAll();
	
	public Producto findById(Long id);
	
	public void save(Producto producto);
	
	public void deleteById(Long id);


}
