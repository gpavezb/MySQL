package com.generation.RedSocialMyPets.controller;

import com.generation.RedSocialMyPets.models.Likes;
import com.generation.RedSocialMyPets.service.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/likes")

public class LikesController {
    @Autowired
    private LikesService likesService;

    @GetMapping("/")
    public String getLikeById(){
        Likes likeSolicitado = likesService.obtenerLikePorId(1L);
        return "La publicación tuvo " + likeSolicitado.getId();
    }
}
