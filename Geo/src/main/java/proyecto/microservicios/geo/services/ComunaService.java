package proyecto.microservicios.geo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.microservicios.geo.entities.Comuna;
import proyecto.microservicios.geo.repositories.ComunaRepositorio;

@Service
public class ComunaService {

	@Autowired
	private ComunaRepositorio comunaRepo;
	
	public List<Comuna> listarComuna(){
		return this.comunaRepo.findAll();
	}
}
