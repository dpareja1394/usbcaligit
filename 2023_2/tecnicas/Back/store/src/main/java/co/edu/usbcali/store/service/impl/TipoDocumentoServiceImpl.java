package co.edu.usbcali.store.service.impl;

import co.edu.usbcali.store.dto.TipoDocumentoDTO;
import co.edu.usbcali.store.mapper.TipoDocumentoMapper;
import co.edu.usbcali.store.repository.TipoDocumentoRepository;
import co.edu.usbcali.store.service.TipoDocumentoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoServiceImpl implements TipoDocumentoService {

    private final TipoDocumentoRepository tipoDocumentoRepository;

    public TipoDocumentoServiceImpl(TipoDocumentoRepository tipoDocumentoRepository) {
        this.tipoDocumentoRepository = tipoDocumentoRepository;
    }


    @Override
    public List<TipoDocumentoDTO> buscarTodos() {
        return TipoDocumentoMapper.domainToDtoList(tipoDocumentoRepository.findAll());
    }

    @Override
    public TipoDocumentoDTO buscarPorId(Integer id) throws Exception {
        if(id == null || id.equals(0)) {
            throw new Exception("Id no válido");
        }

        return TipoDocumentoMapper.domainToDto(tipoDocumentoRepository.getReferenceById(id));
    }
}
