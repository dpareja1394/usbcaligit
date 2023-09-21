package co.edu.usbcali.store.service.impl;

import co.edu.usbcali.store.domain.Categoria;
import co.edu.usbcali.store.dto.CategoriaDTO;
import co.edu.usbcali.store.mapper.CategoriaMapper;
import co.edu.usbcali.store.repository.CategoriaRepository;
import co.edu.usbcali.store.service.CategoriaService;
import org.springframework.stereotype.Service;

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

        if(categoriaDTO.getNombre() == null || categoriaDTO.getNombre().trim().equals("")) {
            throw new Exception("Nombre vacío");
        }

        if(categoriaDTO.getDescripcion() == null || categoriaDTO.getDescripcion().trim().equals("")) {
            throw new Exception("Descripción vacía");
        }

        // 2. Registrar la categoría en DB Mapeando desde DTO hacia DOMAIN
        Categoria categoria = CategoriaMapper.dtoToDomain(categoriaDTO);

        categoria = categoriaRepository.save(categoria);

        // 3. Retornar la categoría mapeada en DTO
        categoriaDTO = CategoriaMapper.domainToDto(categoria);

        return categoriaDTO;
    }
}
