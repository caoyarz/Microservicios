package proyecto.microservicios.geo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.microservicios.geo.dto.Geolocalizacion;
import proyecto.microservicios.geo.entities.Direccion;
import proyecto.microservicios.geo.repositories.DireccionRepositorio;

@Service
public class DireccionService {
	
	@Autowired
	private DireccionRepositorio direccionRepo;
	
	public List<Direccion> listarDireccion(){
		return this.direccionRepo.findAll();
	}
	
	public Geolocalizacion obtenerDireccion(Long direccionId) {
		return this.direccionRepo.obtenerGeo(direccionId);
	}
}
