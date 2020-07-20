package proyecto.microservicios.producto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.microservicios.producto.entities.Producto;
import proyecto.microservicios.producto.repositories.ProductoRepositorio;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepositorio productoRepo;
	
	public List<Producto> listarProductos(){
		return this.productoRepo.findAll();
	}
}
