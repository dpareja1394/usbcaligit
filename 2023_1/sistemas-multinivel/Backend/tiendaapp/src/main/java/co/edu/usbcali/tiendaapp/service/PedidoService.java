package co.edu.usbcali.tiendaapp.service;

import co.edu.usbcali.tiendaapp.dto.PedidoDTO;
import co.edu.usbcali.tiendaapp.request.CrearPedidoRequest;

public interface PedidoService {
    PedidoDTO crearPedido(CrearPedidoRequest crearPedidoRequest) throws Exception;
}
