package proyecto.microservicios.geo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyecto.microservicios.geo.entities.Sucursal;

@Repository
public interface SucursalRepositorio extends JpaRepository<Sucursal,Long>{

}
