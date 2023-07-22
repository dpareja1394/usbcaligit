package co.edu.usbcali.tiendaapp.service.impl;

import co.edu.usbcali.tiendaapp.domain.EstadoPedido;
import co.edu.usbcali.tiendaapp.exceptions.EstadoPedidoException;
import co.edu.usbcali.tiendaapp.repository.EstadoPedidoRepository;
import co.edu.usbcali.tiendaapp.service.EstadoPedidoService;
import co.edu.usbcali.tiendaapp.util.messages.EstadoPedidoServiceMessages;
import org.springframework.stereotype.Service;

@Service
public class EstadoPedidoServiceImpl implements EstadoPedidoService {
    private final EstadoPedidoRepository estadoPedidoRepository;

    public EstadoPedidoServiceImpl(EstadoPedidoRepository estadoPedidoRepository) {
        this.estadoPedidoRepository = estadoPedidoRepository;
    }

    @Override
    public EstadoPedido buscarEstadoPedidoPorDescripcion(String descripcion) throws Exception {
        return estadoPedidoRepository.findByDescripcion(descripcion).orElseThrow(
                () -> new EstadoPedidoException(String.format(EstadoPedidoServiceMessages.NO_ENCONTRADO_POR_DESCRIPCION, descripcion)));
    }
}
