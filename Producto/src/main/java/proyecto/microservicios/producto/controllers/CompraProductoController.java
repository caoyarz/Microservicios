package proyecto.microservicios.producto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.microservicios.producto.dto.CompraPersona;
import proyecto.microservicios.producto.entities.CompraProducto;
import proyecto.microservicios.producto.services.CompraProductoService;


@RestController
@RequestMapping("/api")
public class CompraProductoController {

	@Autowired
	private CompraProductoService compraProductoService;
	
	@GetMapping(value="listar-compra-producto")
	public List<CompraProducto> listarCompraProducto(){
		return this.compraProductoService.listarCompraProducto();
	}
	
	@GetMapping(value="/compra-persona/",produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<CompraPersona> obtenerComprasPersona(){
		return this.compraProductoService.obtenerCompras();
	}
}
