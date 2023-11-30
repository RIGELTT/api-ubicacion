package com.tt.ubicaciones.service.impl;

import com.tt.ubicaciones.dto.UbicacionDTO;
import com.tt.ubicaciones.entity.Ubicacion;
import com.tt.ubicaciones.mapper.UbicacionMapper;
import com.tt.ubicaciones.repository.UbicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UbicacionService implements com.tt.ubicaciones.service.UbicacionService {

    private final UbicacionMapper ubicacionMapper;
    private final UbicacionRepository ubicacionRepository;

    @Autowired
    public UbicacionService(UbicacionMapper ubicacionMapper, UbicacionRepository ubicacionRepository){
        this.ubicacionMapper = ubicacionMapper;
        this.ubicacionRepository = ubicacionRepository;
    }

    @Override
    public UbicacionDTO createUbicacion(UbicacionDTO ubicacionDTO) {
        Ubicacion ubicacion = ubicacionMapper.ubicacionDTOtoUbicacion(ubicacionDTO);

        Ubicacion ubicacionSaved = ubicacionRepository.save(ubicacion);
        UbicacionDTO ubicacionDTOSaved = ubicacionMapper.ubicaciontoUbicacionDTO(ubicacionSaved);

        return ubicacionDTOSaved;
    }

    @Override
    public List<UbicacionDTO> getAllClient() {

        List<Ubicacion> ubicacion = ubicacionRepository.findAll();
        List<UbicacionDTO> clientDto = ubicacionMapper.ubicaciontoUbicacionDTO2(ubicacion);
        return clientDto;

    }
}
