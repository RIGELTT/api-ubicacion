package com.tt.ubicaciones.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class UbicacionDTO {

    private Long idUbicacion;
    private float acopioLatitud;
    private float acopioLongitud;
    private float restauranteLatitud;
    private float restauranteLongitud;
    private float residenciaLatitud;
    private float residenciaLongitud;

}
