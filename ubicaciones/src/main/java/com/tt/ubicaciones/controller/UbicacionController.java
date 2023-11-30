package com.tt.ubicaciones.controller;

import com.tt.ubicaciones.dto.UbicacionDTO;
import com.tt.ubicaciones.entity.Ubicacion;
import com.tt.ubicaciones.service.UbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("ubicacion")
public class UbicacionController {

    private final UbicacionService ubicacionService;

    @Autowired
    public UbicacionController(UbicacionService ubicacionService){
        this.ubicacionService = ubicacionService;
    }

    @PostMapping("/create")
    public ResponseEntity<UbicacionDTO> createUbicacion(@RequestBody UbicacionDTO ubicacionDTO) {
        UbicacionDTO ubicacion = ubicacionService.createUbicacion(ubicacionDTO);

        return new ResponseEntity<>(ubicacion, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List> getAllUbicacion(){
        List<UbicacionDTO> list = ubicacionService.getAllClient();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
