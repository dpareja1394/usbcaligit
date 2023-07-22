package co.edu.usbcali.tiendaapp.service;

import co.edu.usbcali.tiendaapp.domain.EstadoPedido;

public interface EstadoPedidoService {
    EstadoPedido buscarEstadoPedidoPorDescripcion(String descripcion) throws Exception;
}
