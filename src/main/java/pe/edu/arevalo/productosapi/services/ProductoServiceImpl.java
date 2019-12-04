package pe.edu.arevalo.productosapi.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.arevalo.productosapi.entities.Producto;
import pe.edu.arevalo.productosapi.repositories.ProductoRepository;

@Service
@Transactional
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public List<Producto> findAll() {
		return productoRepository.findAll();
	}

	@Override
	public Producto findById(Long id) {
		return productoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
	}

	@Override
	public void save(Producto producto) {
		productoRepository.save(producto);
		
	}

	@Override
	public void deleteById(Long id) {
		productoRepository.deleteById(id);
		
	}

}
