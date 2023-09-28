package co.edu.usbcali.store.service.impl;

import co.edu.usbcali.store.domain.Categoria;
import co.edu.usbcali.store.dto.CategoriaDTO;
import co.edu.usbcali.store.mapper.CategoriaMapper;
import co.edu.usbcali.store.repository.CategoriaRepository;
import co.edu.usbcali.store.service.CategoriaService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public CategoriaDTO guardarNuevaCategoria(CategoriaDTO categoriaDTO) throws Exception {
        // 1. Validar los datos de la categoría
        if (categoriaDTO == null) {
            throw new Exception("La categoría es nula");
        }

        if(categoriaDTO.getNombre() == null || categoriaDTO.getNombre().isBlank()) {
            throw new Exception("Nombre vacío");
        }

        if(categoriaDTO.getDescripcion() == null || categoriaDTO.getDescripcion().isBlank()) {
            throw new Exception("Descripción vacía");
        }

        // Validar que no exista una categoría con ese nombre
        Optional<Categoria> categoriaPorNombre = categoriaRepository.findCategoriaByNombre(categoriaDTO.getNombre());

        if( categoriaPorNombre.isPresent() ) {
            throw new Exception(String.format("La categoría con el nombre %s ya se encuentra registrada",
                    categoriaDTO.getNombre()));
        }

        // 2. Registrar la categoría en DB Mapeando desde DTO hacia DOMAIN
        Categoria categoria = CategoriaMapper.dtoToDomain(categoriaDTO);

        categoria = categoriaRepository.save(categoria);

        // 3. Retornar la categoría mapeada en DTO
        categoriaDTO = CategoriaMapper.domainToDto(categoria);

        return categoriaDTO;
    }
}
