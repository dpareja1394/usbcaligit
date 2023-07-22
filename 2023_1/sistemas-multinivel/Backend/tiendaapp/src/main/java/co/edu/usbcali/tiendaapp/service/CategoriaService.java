package co.edu.usbcali.tiendaapp.service;

import co.edu.usbcali.tiendaapp.domain.Categoria;
import co.edu.usbcali.tiendaapp.dto.CategoriaDTO;
import co.edu.usbcali.tiendaapp.request.CrearCategoriaRequest;

import java.util.List;

public interface CategoriaService {
    List<CategoriaDTO> obtenerTodos();

    CategoriaDTO buscarPorId(Integer id) throws Exception;

    Categoria buscarCategoriaPorId(Integer id) throws Exception;

    CategoriaDTO guardar(CategoriaDTO categoriaDTO) throws Exception;

    CategoriaDTO actualizar(CategoriaDTO categoriaDTO) throws Exception;

    void eliminar(Integer id) throws Exception;

    List<CategoriaDTO> buscarPorNombreLike(String nombre) throws Exception;
    CategoriaDTO crearNuevaCategoria(CrearCategoriaRequest crearCategoriaRequest) throws Exception;
}
