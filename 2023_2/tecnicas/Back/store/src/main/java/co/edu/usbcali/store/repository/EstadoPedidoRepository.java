package co.edu.usbcali.store.repository;

import co.edu.usbcali.store.domain.EstadoPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoPedidoRepository extends JpaRepository<EstadoPedido, Integer> {
}
