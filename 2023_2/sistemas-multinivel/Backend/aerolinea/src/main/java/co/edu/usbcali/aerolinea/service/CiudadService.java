package co.edu.usbcali.aerolinea.service;

import co.edu.usbcali.aerolinea.dto.CiudadDTO;

public interface CiudadService {

    CiudadDTO guardarNuevaCiudad(CiudadDTO ciudadDTO) throws Exception;

    CiudadDTO modificarCiudad(CiudadDTO ciudadDTO) throws Exception;

}
