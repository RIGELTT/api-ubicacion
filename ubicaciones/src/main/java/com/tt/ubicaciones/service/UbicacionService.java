package com.tt.ubicaciones.service;

import com.tt.ubicaciones.dto.UbicacionDTO;

import java.util.List;

public interface UbicacionService {

    UbicacionDTO createUbicacion(UbicacionDTO ubicacionDTO);

    List<UbicacionDTO> getAllClient();
}
