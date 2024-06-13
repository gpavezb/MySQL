package com.generation.RedSocialMyPets.controller;
import com.generation.RedSocialMyPets.models.Comentario;
import com.generation.RedSocialMyPets.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/comentario")

public class ComentarioController {

    @Autowired
    private ComentarioService comentarioService;

    @GetMapping("/")
    public String getComentarioId(){
        Comentario comentarioSolicitado = comentarioService.obtenerComentarioId(1L);
        return "El comentario es " + comentarioSolicitado.getComentarioId();
    }
}
