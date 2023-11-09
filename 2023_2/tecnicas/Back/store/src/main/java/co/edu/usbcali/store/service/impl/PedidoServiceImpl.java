package co.edu.usbcali.store.service.impl;

import co.edu.usbcali.store.dto.PedidoDTO;
import co.edu.usbcali.store.mapper.PedidoMapper;
import co.edu.usbcali.store.repository.PedidoRepository;
import co.edu.usbcali.store.service.PedidoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl implements PedidoService {


    private final PedidoRepository pedidoRepository;

    public PedidoServiceImpl(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public List<PedidoDTO> buscarPedidosDeUnCliente(Integer clienteId) throws Exception{
        if(clienteId == null || clienteId.equals(0)){
            throw new Exception("Id del cliente no valido");
        }
        return PedidoMapper.domainToDtoList(pedidoRepository.findPedidoByClienteId(clienteId));
    }
}
