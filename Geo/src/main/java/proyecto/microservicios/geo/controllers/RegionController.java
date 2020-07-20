package proyecto.microservicios.geo.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.microservicios.geo.entities.Region;
import proyecto.microservicios.geo.services.RegionService;

@RestController
@RequestMapping("/api")
public class RegionController {

	@Autowired 
	private RegionService regionService;
	
	@GetMapping(value="listar-regiones")
	private List<Region> listarRegiones(){
		return this.regionService.listarRegiones();
	}
}
