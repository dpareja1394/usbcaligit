package co.edu.usbcali.tiendaapp.service;

import co.edu.usbcali.tiendaapp.domain.Cliente;
import co.edu.usbcali.tiendaapp.dto.ClienteDTO;
import co.edu.usbcali.tiendaapp.request.CrearClienteRequest;
import co.edu.usbcali.tiendaapp.response.CrearClienteResponse;
import co.edu.usbcali.tiendaapp.response.VerClientesActivosResponse;

import java.util.List;

public interface ClienteService {
    List<ClienteDTO> obtenerTodos();
    ClienteDTO buscarPorId(Integer id) throws Exception;
    ClienteDTO guardar(ClienteDTO clienteDTO) throws Exception;
    ClienteDTO actualizar(ClienteDTO clienteDTO) throws Exception;
    CrearClienteResponse crearCliente(CrearClienteRequest crearClienteRequest) throws Exception;
    Cliente buscarClientePorCedulaYTipoDocumento(String documento, Integer tipoDocumento) throws Exception;
    List<VerClientesActivosResponse> verClientesActivos();
}
