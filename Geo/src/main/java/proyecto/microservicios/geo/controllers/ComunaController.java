package proyecto.microservicios.geo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.microservicios.geo.entities.Comuna;
import proyecto.microservicios.geo.services.ComunaService;

@RestController
@RequestMapping("/api")
public class ComunaController {
	
	@Autowired
	private ComunaService comunaService;
	
	@GetMapping(value="listar-comunas")
	public List<Comuna> listarComunas(){
		return this.comunaService.listarComuna();
	}
}
