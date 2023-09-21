package co.edu.usbcali.store.controller;

import co.edu.usbcali.store.domain.Categoria;
import co.edu.usbcali.store.dto.CategoriaDTO;
import co.edu.usbcali.store.repository.CategoriaRepository;
import co.edu.usbcali.store.service.CategoriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private final CategoriaService categoriaService;
    private final CategoriaRepository categoriaRepository;

    public CategoriaController(CategoriaService categoriaService, CategoriaRepository categoriaRepository) {
        this.categoriaService = categoriaService;
        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping("/obtenerTodas")
    public List<Categoria> obtenerTodos(){
        return categoriaRepository.findAll();
    }

    @PostMapping("/guardar")
    public ResponseEntity<CategoriaDTO> guardarCategoria(@RequestBody CategoriaDTO categoriaDTO) throws Exception {

        CategoriaDTO categoriaDTO1 = categoriaService.guardarNuevaCategoria(categoriaDTO);

        return new ResponseEntity<>(categoriaDTO1, HttpStatus.OK);
    }

}
