package co.edu.usbcali.tiendaapp.controller;

import co.edu.usbcali.tiendaapp.dto.EstadoPedidoDTO;
import co.edu.usbcali.tiendaapp.mapper.EstadoPedidoMapper;
import co.edu.usbcali.tiendaapp.repository.EstadoPedidoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/estadopedido")
public class EstadoPedidoController {

    private final EstadoPedidoRepository estadoPedidoRepository;

    public EstadoPedidoController(EstadoPedidoRepository estadoPedidoRepository) {
        this.estadoPedidoRepository = estadoPedidoRepository;
    }

    @GetMapping(value = "/buscarTodos")
    List<EstadoPedidoDTO> buscarTodos() {
        return EstadoPedidoMapper.domainToDtoList(estadoPedidoRepository.findAll());
    }

}
