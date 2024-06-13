package com.generation.RedSocialMyPets.service;

import com.generation.RedSocialMyPets.models.Foto;
import com.generation.RedSocialMyPets.repository.FotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FotoService {

    @Autowired
    private FotoRepository fotoRepository;
    public Foto obtenerFotoId(long idFoto){
        return fotoRepository.getReferenceById(idFoto);
    }
}