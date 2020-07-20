package proyecto.microservicios.producto.services;

import java.util.LinkedList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.microservicios.producto.dto.CompraPersona;
import proyecto.microservicios.producto.dto.Usuario;
import proyecto.microservicios.producto.entities.CompraProducto;
import proyecto.microservicios.producto.repositories.CompraProductoRepositorio;
import proyecto.microservicios.producto.util.EndPoints;
import proyecto.microservicios.producto.util.RestTemplateUtil;
@Service
public class CompraProductoService {

	@Autowired
	private CompraProductoRepositorio compraProductoRepo;
	
	@Autowired
	private RestTemplateUtil restTemplate;
	
	public List<CompraProducto> listarCompraProducto(){
		return this.compraProductoRepo.findAll();
	}
	
	
	public List<CompraPersona> obtenerCompras(){
		List<CompraProducto> listaCompras= this.compraProductoRepo.findAll();
		List<CompraPersona> listarCompraPersona=new LinkedList<CompraPersona>();
		for(CompraProducto index: listaCompras) {
			CompraPersona compraPersona = new CompraPersona();
			
			Usuario usuarioIndex = restTemplate.getUsuario(EndPoints.COMPRA_PERSONA+index.getPersonaId()).getBody();
			compraPersona.setNombrePersona(usuarioIndex.getNombrePersona());
			compraPersona.setRutPersona(usuarioIndex.getRutPersona());
			
			compraPersona.setNombreProducto(index.getProductoId().getNombreProducto());
			compraPersona.setPrecioProducto(index.getProductoId().getPrecioProducto());
			compraPersona.setFechaCompra(index.getFechaCompra());
			
			listarCompraPersona.add(compraPersona);
	}
		return listarCompraPersona;
}
}
