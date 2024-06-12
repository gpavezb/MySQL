package com.generation.RedSocialMyPets.controller;

import com.generation.RedSocialMyPets.models.Mascota;
import com.generation.RedSocialMyPets.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/mascota")

public class MascotasController {

    @Autowired
    private MascotaService mascotaService;

    @GetMapping("/")
    public String getMascotataById(){
        Mascota mascotaSolicitada = mascotaService.obtenerMascotaPorId(1L);
        return "La mascota se llama " + mascotaSolicitada.getNombre();
    }
}
