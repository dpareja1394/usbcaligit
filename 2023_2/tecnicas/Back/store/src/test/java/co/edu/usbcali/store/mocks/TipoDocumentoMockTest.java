package co.edu.usbcali.store.mocks;

import co.edu.usbcali.store.domain.TipoDocumento;
import co.edu.usbcali.store.dto.TipoDocumentoDTO;
import co.edu.usbcali.store.mapper.TipoDocumentoMapper;

import java.util.Arrays;
import java.util.List;

public class TipoDocumentoMockTest {
    public static Integer ID_UNO = 1;
    public static Integer ID_DOS = 2;
    public static String CEDULA = "CEDULA";
    public static String PASAPORTE = "PASAPORTE";

    public static TipoDocumento TIPO_DOCUMENTO_UNO =
            TipoDocumento.builder()
                    .id(ID_UNO)
                    .descripcion(CEDULA)
                    .build();

    public static TipoDocumento TIPO_DOCUMENTO_DOS =
            TipoDocumento.builder()
                    .id(ID_DOS)
                    .descripcion(PASAPORTE)
                    .build();

    public static List<TipoDocumento> TIPOS_DOCUMENTOS_LIST =
            Arrays.asList(TIPO_DOCUMENTO_UNO, TIPO_DOCUMENTO_DOS);

    public static List<TipoDocumentoDTO> TIPOS_DOCUMENTOS_DTO_LIST =
            TipoDocumentoMapper.domainToDtoList(TIPOS_DOCUMENTOS_LIST);
}
