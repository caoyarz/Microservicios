package proyecto.microservicios.geo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.microservicios.geo.entities.Sucursal;
import proyecto.microservicios.geo.services.SucursalService;

@RestController
@RequestMapping("/api")
public class SucursalController {
 
	@Autowired
	private SucursalService sucursalService;
	
	@GetMapping("listar-sucursales")
	public List<Sucursal> listarSucursales(){
		return this.sucursalService.listarSucursales();
	}
}
