package com.generation.RedSocialMyPets.service;

import com.generation.RedSocialMyPets.models.Like;
import com.generation.RedSocialMyPets.repository.LikesRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LikesService {

    @Autowired
    private LikesRespository likesRespository;
    public Like obtenerLikePorId(Long idLike){
        return likesRespository.getReferenceById(idLike);
    }
}
