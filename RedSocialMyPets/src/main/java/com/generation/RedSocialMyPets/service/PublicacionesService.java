package com.generation.RedSocialMyPets.service;
import com.generation.RedSocialMyPets.models.Publicaciones;
import com.generation.RedSocialMyPets.repository.PublicacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicacionesService {

    @Autowired
    private PublicacionesRepository publicacionesRepository;

    public Publicaciones obtenerPublicacionPorId(Long id) {
        return publicacionesRepository.getReferenceById(id);
    }
}



