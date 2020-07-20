package proyecto.microservicios.geo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.microservicios.geo.entities.Provincia;
import proyecto.microservicios.geo.repositories.ProvinciaRepositorio;

@Service
public class ProvinciaService {

	@Autowired
	private ProvinciaRepositorio provinciaRepo;
	
	public List<Provincia> listarProvincia(){
		return this.provinciaRepo.findAll();
	}
}
