package co.edu.usbcali.store.mapper;

import co.edu.usbcali.store.domain.Cliente;
import co.edu.usbcali.store.dto.ClienteCompletoDTO;
import co.edu.usbcali.store.dto.ClienteDTO;
import co.edu.usbcali.store.dto.PedidoDTO;

import java.util.List;

public class ClienteMapper {

    public static ClienteDTO domainToDto(Cliente cliente) {
        return ClienteDTO.builder()
                .id(cliente.getId())
                .nombres(cliente.getNombres())
                .apellidos(cliente.getApellidos())
                .documento(cliente.getDocumento())
                .estado(cliente.getEstado())
                .tipoDocumentoId((cliente.getTipoDocumento() == null) ? null :
                        cliente.getTipoDocumento().getId())
                .build();
    }

    public static Cliente dtoToDomain(ClienteDTO clienteDTO) {
        return Cliente.builder()
                .id(clienteDTO.getId())
                .nombres(clienteDTO.getNombres())
                .apellidos(clienteDTO.getApellidos())
                .documento(clienteDTO.getDocumento())
                .estado(clienteDTO.getEstado())
                .build();
    }

    public static ClienteCompletoDTO domainToClienteCompleto(Cliente cliente, List<PedidoDTO> pedidos) {
        return ClienteCompletoDTO.builder()
                .id(cliente.getId())
                .nombres(cliente.getNombres())
                .apellidos(cliente.getApellidos())
                .documento(cliente.getDocumento())
                .estado(cliente.getEstado())
                .tipoDocumentoId((cliente.getTipoDocumento() == null) ? null :
                        cliente.getTipoDocumento().getId())
                .pedidos(pedidos)
                .build();
    }

    public static List<ClienteDTO> domainToDtoList(List<Cliente> clientes) {
        return clientes.stream().map(ClienteMapper::domainToDto).toList();
    }

    public static List<Cliente> dtoToDomainList(List<ClienteDTO> clientesDtos) {
        return clientesDtos.stream().map(ClienteMapper::dtoToDomain).toList();
    }

}
