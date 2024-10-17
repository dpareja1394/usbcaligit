package co.edu.usbcali.store.service.impl;

import co.edu.usbcali.store.domain.Cliente;
import co.edu.usbcali.store.dto.ClienteCompletoDTO;
import co.edu.usbcali.store.dto.PedidoDTO;
import co.edu.usbcali.store.mapper.ClienteMapper;
import co.edu.usbcali.store.repository.ClienteRepository;
import co.edu.usbcali.store.service.ClienteService;
import co.edu.usbcali.store.service.PedidoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;
    private final PedidoService pedidoService;

    public ClienteServiceImpl(ClienteRepository clienteRepository, PedidoService pedidoService) {
        this.clienteRepository = clienteRepository;
        this.pedidoService = pedidoService;
    }


    @Override
    public ClienteCompletoDTO buscarDatosClienteYPedidos(Integer clienteId) throws Exception {
        if(clienteId == null || clienteId.equals(0)) {
            throw new Exception("Id del cliente no válido");
        }

        Cliente cliente = clienteRepository.getReferenceById(clienteId);
        List<PedidoDTO> pedidos = pedidoService.buscarPedidosDeUnCliente(clienteId);

        return ClienteMapper.domainToClienteCompleto(cliente, pedidos);
    }
}
