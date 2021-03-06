package proyecto.microservicios.geo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.microservicios.geo.entities.Provincia;
import proyecto.microservicios.geo.services.ProvinciaService;

@RestController
@RequestMapping("/api")
public class ProvinciaController {

	@Autowired
	private ProvinciaService provinciaService;
	@GetMapping(value = "listar-provincias")
	public List<Provincia> listarProvincias(){
		return this.provinciaService.listarProvincia();
	}
}
