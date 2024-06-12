package com.generation.RedSocialMyPets.controller;

import com.generation.RedSocialMyPets.models.Publicaciones;
import com.generation.RedSocialMyPets.service.PublicacionesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/publicacion")

public class PublicacionesController {

    @Autowired
    private PublicacionesService publicacionesService;

    @GetMapping("/")
    public String getPublicacionById(){
        Publicaciones publicacionSolicitado = publicacionesService.obtenerPublicacionPorId(1L);
        return "Este era el mensaje" + publicacionSolicitado.getContenido();
    }
}
