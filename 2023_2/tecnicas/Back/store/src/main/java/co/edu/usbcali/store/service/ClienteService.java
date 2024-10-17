package co.edu.usbcali.store.service;

import co.edu.usbcali.store.dto.ClienteCompletoDTO;

public interface ClienteService {

    public ClienteCompletoDTO buscarDatosClienteYPedidos(Integer clienteId) throws Exception;

}
