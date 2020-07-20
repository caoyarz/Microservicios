package proyecto.microservicios.geo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.microservicios.geo.dto.Geolocalizacion;
import proyecto.microservicios.geo.entities.Direccion;
import proyecto.microservicios.geo.services.DireccionService;

@RestController
@RequestMapping("/api")
public class DireccionController {

	@Autowired
	private DireccionService direccionService;
	
	@GetMapping(value="listar-direccion")
	public List<Direccion> listarDireccion(){
		return this.direccionService.listarDireccion();
	}
	
	@GetMapping(value="direccion-persona/{direccionId}",produces= {MediaType.APPLICATION_JSON_VALUE})
	public Geolocalizacion obtenerDireccionPorDireccionPersona(@PathVariable Long direccionId) {
		return this.direccionService.obtenerDireccion(direccionId);
	}
}
