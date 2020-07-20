package proyecto.microservicios.geo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.microservicios.geo.entities.Sucursal;
import proyecto.microservicios.geo.repositories.SucursalRepositorio;


@Service
public class SucursalService {

	@Autowired
	private SucursalRepositorio sucursalRepo;
	
	public List<Sucursal> listarSucursales(){
		return this.sucursalRepo.findAll();
}
}
