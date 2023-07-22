package co.edu.usbcali.tiendaapp.controller;

import co.edu.usbcali.tiendaapp.dto.ClienteDTO;
import co.edu.usbcali.tiendaapp.request.CrearClienteRequest;
import co.edu.usbcali.tiendaapp.response.CrearClienteResponse;
import co.edu.usbcali.tiendaapp.response.VerClientesActivosResponse;
import co.edu.usbcali.tiendaapp.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("/nuevo")
    CrearClienteResponse nuevoCliente(@RequestBody @Valid CrearClienteRequest crearClienteRequest) throws Exception {
        return clienteService.crearCliente(crearClienteRequest);
    }

    @GetMapping("/verTodos")
    List<ClienteDTO> verTodosLosClientes() throws Exception {
        return clienteService.obtenerTodos();
    }

    @GetMapping("/verTodosActivos")
    List<VerClientesActivosResponse> verClientesActivos() {
        return clienteService.verClientesActivos();
    }
}
