package co.edu.usbcali.store.repository;

import co.edu.usbcali.store.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    List<Pedido> findPedidoByClienteId(Integer clienteId);
}
