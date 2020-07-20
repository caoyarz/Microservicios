package proyecto.microservicios.usuario.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.microservicios.usuario.entities.TipoUsuario;
import  proyecto.microservicios.usuario.repositories.TipoUsuarioRepositorio;

@Service
public class TipoUsuarioService {
	@Autowired
	private TipoUsuarioRepositorio tipoUsuarioRepositorio;
	
	public List<TipoUsuario> traerDatos(){
		return this.tipoUsuarioRepositorio.findAll();
	}
	
	public Boolean crearTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuarioRepositorio.save(tipoUsuario);
		return true;
	}
}
