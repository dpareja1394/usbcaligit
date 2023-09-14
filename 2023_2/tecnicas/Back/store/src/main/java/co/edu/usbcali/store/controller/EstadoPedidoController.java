package co.edu.usbcali.store.controller;

import co.edu.usbcali.store.domain.EstadoPedido;
import co.edu.usbcali.store.repository.EstadoPedidoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estado-pedido")
public class EstadoPedidoController {

    private final EstadoPedidoRepository estadoPedidoRepository;

    public EstadoPedidoController(EstadoPedidoRepository estadoPedidoRepository) {
        this.estadoPedidoRepository = estadoPedidoRepository;
    }

    @GetMapping("/obtenerTodos")
    public List<EstadoPedido> obtenerTodos(){
        return estadoPedidoRepository.findAll();
    }
}
