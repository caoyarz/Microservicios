package proyecto.microservicios.producto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyecto.microservicios.producto.entities.TipoProducto;

@Repository
public interface TipoProductoRespositorio extends JpaRepository<TipoProducto, Long>{

}
