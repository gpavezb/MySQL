package com.generation.RedSocialMyPets.controller;
import com.generation.RedSocialMyPets.models.Especie;
import com.generation.RedSocialMyPets.service.EspecieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/especie")

public class EspecieController {
    @Autowired
    private EspecieService especieService;

    @GetMapping("/")
    public String getEspecieById(){
        Especie especieSolicitado= especieService.obtenerEspecieId(1L);
        return "La especie es " + especieSolicitado.getEspecieId();
    }
}
