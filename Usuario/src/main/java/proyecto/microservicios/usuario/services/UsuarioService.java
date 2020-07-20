package proyecto.microservicios.usuario.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.microservicios.usuario.entities.Usuario;
import  proyecto.microservicios.usuario.repositories.UsuarioRepositorio;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepositorio usuarioRepo;
	
	public List<Usuario> listarUsuario(){
		return this.usuarioRepo.findAll();
	}
}
