package proyecto.microservicios.usuario.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import proyecto.microservicios.usuario.dto.PersonaDTO;
import proyecto.microservicios.usuario.dto.Usuario;
import proyecto.microservicios.usuario.dto.UsuarioDTO;
import proyecto.microservicios.usuario.entities.Persona;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long> {

	@Query("SELECT new proyecto.microservicios.usuario.dto.UsuarioDTO"
			+ "(p.nombrePersona,p.usuario.nombreUsuario,p.usuario.tipoUsuario.nombreTipoUsuario)" + "FROM Persona p "
			+ "where p.activo=1 and p.usuario.activoUsuario=1 and p.usuario.tipoUsuario.activo =1 and "
			+ "p.usuario.tipoUsuario.nombreTipoUsuario='Admin' ")
	List<UsuarioDTO> traerUsuarioActivoAdmin();

	@Query("SELECT new proyecto.microservicios.usuario.dto.PersonaDTO(p.id, " + "p.nombrePersona, " + "p.rut, "
			+ "p.direccionId) " + "FROM Persona p")
	List<PersonaDTO> listaPersonasCustomizada();

	@Query("SELECT new proyecto.microservicios.usuario.dto.PersonaDTO(p.id, " + "p.nombrePersona, " + "p.rut, "
			+ "p.direccionId ) " + "FROM Persona p WHERE p.id = ?1 ")
	PersonaDTO findPersonaById(Long personaId);

	@Query("SELECT new proyecto.microservicios.usuario.dto.Usuario"
			+ "(p.nombrePersona as nombrePersona, p.rut as rutPersona) "
			+ "FROM Persona p "
			+ "WHERE p.activo=1 and p.id=?1 ")
	Usuario obtenerUser(Long personaId);
}


