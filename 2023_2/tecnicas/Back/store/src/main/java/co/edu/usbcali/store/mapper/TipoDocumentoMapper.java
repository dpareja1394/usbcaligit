package co.edu.usbcali.store.mapper;

import co.edu.usbcali.store.domain.TipoDocumento;
import co.edu.usbcali.store.dto.TipoDocumentoDTO;

import java.util.List;

public class TipoDocumentoMapper {

    public static TipoDocumento dtoToDomain(TipoDocumentoDTO tipoDocumentoDTO) {
        return TipoDocumento.builder()
                .id(tipoDocumentoDTO.getId())
                .descripcion(tipoDocumentoDTO.getDescripcion())
                .build();
    }

    public static TipoDocumentoDTO domainToDto(TipoDocumento tipoDocumento) {
        return TipoDocumentoDTO.builder()
                .id(tipoDocumento.getId())
                .descripcion(tipoDocumento.getDescripcion())
                .build();
    }

    public static List<TipoDocumento> dtoToDomainList(List<TipoDocumentoDTO> tipoDocumentoDTOS) {
        /*List<TipoDocumento> tipoDocumentoList = new ArrayList<>();

        for (TipoDocumentoDTO tipoDocumento:tipoDocumentoDTOS) {
            TipoDocumento tipoDocumento1 = dtoToDomain(tipoDocumento);
            tipoDocumentoList.add(tipoDocumento1);
        }

        return tipoDocumentoList;*/
        return tipoDocumentoDTOS.stream().map(TipoDocumentoMapper::dtoToDomain).toList();
    }

    public static List<TipoDocumentoDTO> domainToDtoList(List<TipoDocumento> tipoDocumentos) {
        return tipoDocumentos.stream().map(TipoDocumentoMapper::domainToDto).toList();
    }

}
