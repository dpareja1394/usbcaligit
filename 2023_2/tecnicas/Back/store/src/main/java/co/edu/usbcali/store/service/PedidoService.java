package co.edu.usbcali.store.service;

import co.edu.usbcali.store.dto.PedidoDTO;

import java.util.List;

public interface PedidoService {

    List<PedidoDTO> buscarPedidosDeUnCliente(Integer clienteId) throws Exception;

}
