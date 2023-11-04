package co.edu.usbcali.aerolinea.controller;

import co.edu.usbcali.aerolinea.domain.Pais;
import co.edu.usbcali.aerolinea.dto.PaisDTO;
import co.edu.usbcali.aerolinea.mapper.PaisMapper;
import co.edu.usbcali.aerolinea.repository.PaisRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pais")
public class PaisController {

    // Declarar el Repository para hacer uso
    public final PaisRepository paisRepository;

    // Inyección de dependencias por Constructor
    public PaisController(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    @GetMapping(value = "/validarController")
    public String validarController() {
        return "Controlador funcionando correctamente";
    }

    @GetMapping(value = "/obtenerPaises")
    public List<PaisDTO> obtenerPaises() {
        // 1. Consulto TODOS los paises existentes en BD
        List<Pais> paises = paisRepository.findAll();

        // 2. Instancio una nueva lista de Dto a retornar en el método
        List<PaisDTO> paisesDto;

        // 3. Mapeo los paises que consultó hacia Dto
        paisesDto = PaisMapper.domainToDtoList(paises);

        // 4. Retorno los dtos transformados en el paso anterior
        return paisesDto;
    }

    @GetMapping(value = "/buscarPorId/{id}")
    public ResponseEntity<PaisDTO> buscarPorId(@PathVariable Integer id) {
        Pais pais = paisRepository.getReferenceById(id);
        PaisDTO paisDTO = PaisMapper.domainToDto(pais);
        return new ResponseEntity<>(paisDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/buscarPorCodigo/{codigo}")
    public ResponseEntity<PaisDTO> buscarPorCodigo(@PathVariable String codigo) {
        Pais pais = paisRepository.findPaisByCodigo(codigo);
        PaisDTO paisDTO = PaisMapper.domainToDto(pais);
        return new ResponseEntity<>(paisDTO, HttpStatus.OK);
    }


}
