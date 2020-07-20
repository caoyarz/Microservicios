package proyecto.microservicios.producto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.microservicios.producto.entities.TipoProducto;
import proyecto.microservicios.producto.repositories.TipoProductoRespositorio;

@Service
public class TipoProductoService {

	@Autowired
	private TipoProductoRespositorio tipoProductoRepo;
	
	public List<TipoProducto> listarTipoProducto(){
		return this.tipoProductoRepo.findAll();
	}
}
