package pe.edu.arevalo.productosapi.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pe.edu.arevalo.productosapi.entities.*;

public interface ProductoRepository extends CrudRepository<Producto, Long> {
	
	@Override
	List<Producto> findAll();
}
