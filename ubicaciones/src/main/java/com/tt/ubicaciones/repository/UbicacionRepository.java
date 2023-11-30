package com.tt.ubicaciones.repository;

import com.tt.ubicaciones.entity.Ubicacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UbicacionRepository extends JpaRepository<Ubicacion, Long> {
}
