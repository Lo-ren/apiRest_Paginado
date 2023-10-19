package com.example.paginacion.controladores;

import com.example.paginacion.entidades.Autor;
import com.example.paginacion.servicios.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v2/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{
}