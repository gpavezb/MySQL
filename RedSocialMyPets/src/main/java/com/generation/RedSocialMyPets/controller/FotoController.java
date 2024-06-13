package com.generation.RedSocialMyPets.controller;
import com.generation.RedSocialMyPets.models.Foto;
import com.generation.RedSocialMyPets.service.FotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/foto")

public class FotoController {
    @Autowired
    private FotoService fotoService;

    @GetMapping("/")
    public String getLikeById() {
        Foto fotoSolicitado = fotoService.obtenerFotoId(1L);
        return "La foto es " + fotoSolicitado.getFotoId();
    }

}
