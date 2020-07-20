package proyecto.microservicios.producto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyecto.microservicios.producto.entities.CompraProducto;

@Repository
public interface CompraProductoRepositorio extends JpaRepository<CompraProducto, Long> {

}
