package com.tt.ubicaciones.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Ubicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUbicacion;

    private float acopioLatitud;
    private float acopioLongitud;
    private float restauranteLatitud;
    private float restauranteLongitud;
    private float residenciaLatitud;
    private float residenciaLongitud;

}
