package proyecto.microservicios.geo.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.microservicios.geo.entities.Region;
import proyecto.microservicios.geo.repositories.RegionRepositorio;

@Service
public class RegionService {

	@Autowired
	private RegionRepositorio regionRepo;
	
	public List<Region> listarRegiones(){
		return this.regionRepo.findAll();
}
	}
