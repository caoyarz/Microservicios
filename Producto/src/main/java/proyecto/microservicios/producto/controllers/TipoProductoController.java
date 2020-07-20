package proyecto.microservicios.producto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.microservicios.producto.entities.TipoProducto;
import proyecto.microservicios.producto.services.TipoProductoService;

@RestController
@RequestMapping("/api")
public class TipoProductoController {

	@Autowired
	private TipoProductoService tipoProductoService;
	
	@GetMapping(value="leer-tipo-producto")
	public List<TipoProducto> listarTipoProducto(){
		return this.tipoProductoService.listarTipoProducto();
	}
	
}
