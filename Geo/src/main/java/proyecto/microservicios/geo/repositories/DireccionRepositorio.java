package proyecto.microservicios.geo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import proyecto.microservicios.geo.dto.Geolocalizacion;
import proyecto.microservicios.geo.entities.Direccion;

@Repository
public interface DireccionRepositorio extends JpaRepository<Direccion,Long>{

	@Query("SELECT new proyecto.microservicios.geo.dto.Geolocalizacion(d.nombreDireccion as nombreDireccion,"
			+ "d.comuna.nombreComuna as nombreComuna,"
			+ "d.comuna.provincia.nombreProvincia as nombreProvincia,"
			+ "d.comuna.provincia.region.nombreRegion as nombreRegion) "
			+ "FROM Direccion d "
			+ "WHERE d.id=?1 AND d.activo=1")
	Geolocalizacion obtenerGeo(Long direccionId);
}
