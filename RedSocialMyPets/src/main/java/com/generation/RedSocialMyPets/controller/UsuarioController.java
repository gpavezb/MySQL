package com.generation.RedSocialMyPets.controller;

import com.generation.RedSocialMyPets.models.Usuario;
import com.generation.RedSocialMyPets.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/usuario")

public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public String getUsuarioById(){
        Usuario usuarioSolicitado = usuarioService.obtenerUsuarioPorId(1L);
        return "Hola soy " + usuarioSolicitado.getNombre();
    }
}
