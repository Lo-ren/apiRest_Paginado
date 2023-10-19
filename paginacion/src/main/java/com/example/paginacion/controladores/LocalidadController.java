package com.example.paginacion.controladores;

import com.example.paginacion.entidades.Localidad;
import com.example.paginacion.servicios.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v2/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{
}