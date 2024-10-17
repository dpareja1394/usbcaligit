package co.edu.usbcali.store.service;

import co.edu.usbcali.store.domain.Categoria;
import co.edu.usbcali.store.dto.CategoriaDTO;

import java.util.List;

public interface CategoriaService {
    CategoriaDTO guardarNuevaCategoria(CategoriaDTO categoriaDTO) throws Exception;

    List<CategoriaDTO> obtenerTodas() throws Exception;

}
