package co.edu.usbcali.aerolinea.mapper;

import co.edu.usbcali.aerolinea.domain.Ciudad;
import co.edu.usbcali.aerolinea.dto.CiudadDTO;

public class CiudadMapper {

    public static CiudadDTO domainToDto(Ciudad ciudad) {
        return CiudadDTO
                .builder()
                .id(ciudad.getId())
                .nombre(ciudad.getNombre())
                .descripcion(ciudad.getDescripcion())
                .latitud(ciudad.getLatitud())
                .longitud(ciudad.getLongitud())
                .idPais((ciudad.getPais() != null) ? ciudad.getPais().getId()
                        : null)
                .build();
    }

    public static Ciudad dtoToDomain(CiudadDTO ciudadDTO) {
        return Ciudad
                .builder()
                .id(ciudadDTO.getId())
                .nombre(ciudadDTO.getNombre())
                .descripcion(ciudadDTO.getDescripcion())
                .latitud(ciudadDTO.getLatitud())
                .longitud(ciudadDTO.getLongitud())
                .build();
    }

}
