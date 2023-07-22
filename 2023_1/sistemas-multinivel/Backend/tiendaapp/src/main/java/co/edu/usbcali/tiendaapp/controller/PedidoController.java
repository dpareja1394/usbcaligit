package co.edu.usbcali.tiendaapp.controller;

import co.edu.usbcali.tiendaapp.dto.PedidoDTO;
import co.edu.usbcali.tiendaapp.request.CrearPedidoRequest;
import co.edu.usbcali.tiendaapp.service.PedidoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping(value = "/nuevo")
    PedidoDTO nuevoPedido(@RequestBody @Valid CrearPedidoRequest crearPedidoRequest) throws Exception {
        return pedidoService.crearPedido(crearPedidoRequest);
    }
}
