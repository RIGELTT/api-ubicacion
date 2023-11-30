package com.tt.ubicaciones.mapper;

import com.tt.ubicaciones.dto.UbicacionDTO;
import com.tt.ubicaciones.entity.Ubicacion;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        uses= {Ubicacion.class, UbicacionDTO.class})
public interface UbicacionMapper {

    Ubicacion ubicacionDTOtoUbicacion(UbicacionDTO ubicacionDTO);
    List<Ubicacion> ubicacionDTOtoUbicacion2(List<UbicacionDTO> ubicacionDTO);

    UbicacionDTO ubicaciontoUbicacionDTO(Ubicacion ubicacion);

    List<UbicacionDTO> ubicaciontoUbicacionDTO2(List<Ubicacion> ubicacion);


}
