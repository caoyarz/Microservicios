package proyecto.microservicios.producto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.microservicios.producto.entities.Producto;
import proyecto.microservicios.producto.services.ProductoService;

@RestController
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping(value="listar-producto")
	public List<Producto> listarProductos(){
		return this.productoService.listarProductos();
	}
}
