package co.edu.usbcali.tiendaapp.service.impl;

import co.edu.usbcali.tiendaapp.domain.Cliente;
import co.edu.usbcali.tiendaapp.domain.EstadoPedido;
import co.edu.usbcali.tiendaapp.domain.Pedido;
import co.edu.usbcali.tiendaapp.dto.PedidoDTO;
import co.edu.usbcali.tiendaapp.mapper.PedidoMapper;
import co.edu.usbcali.tiendaapp.repository.PedidoRepository;
import co.edu.usbcali.tiendaapp.request.CrearPedidoRequest;
import co.edu.usbcali.tiendaapp.service.ClienteService;
import co.edu.usbcali.tiendaapp.service.EstadoPedidoService;
import co.edu.usbcali.tiendaapp.service.PedidoService;
import co.edu.usbcali.tiendaapp.util.ConstantesUtility;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;

@Service
public class PedidoServiceImpl implements PedidoService {

    private final PedidoRepository pedidoRepository;
    private final ClienteService clienteService;
    private final EstadoPedidoService estadoPedidoService;

    public PedidoServiceImpl(PedidoRepository pedidoRepository, ClienteService clienteService, EstadoPedidoService estadoPedidoService) {
        this.pedidoRepository = pedidoRepository;
        this.clienteService = clienteService;
        this.estadoPedidoService = estadoPedidoService;
    }

    @Override
    public PedidoDTO crearPedido(CrearPedidoRequest crearPedidoRequest) throws Exception {
        // Consultar el Cliente por Cedula y Tipo Documento
        Cliente cliente = clienteService.buscarClientePorCedulaYTipoDocumento(crearPedidoRequest.getIdentificacion(),
                crearPedidoRequest.getTipoDocumentoId());

        // Consultar el Estado de Pedido Inicial (Preparación)
        EstadoPedido estadoPedido = estadoPedidoService.buscarEstadoPedidoPorDescripcion(ConstantesUtility.ESTADO_PEDIDO_PREPARACION);

        // Crear nuevo Pedido y retornar el DTO
        return PedidoMapper.domainToDto(pedidoRepository.save(
                Pedido.builder()
                        .cliente(cliente)
                        .estadoPedido(estadoPedido)
                        .fecha(Instant.now())
                        .total(BigDecimal.ZERO)
                        .build()
        ));
    }
}
