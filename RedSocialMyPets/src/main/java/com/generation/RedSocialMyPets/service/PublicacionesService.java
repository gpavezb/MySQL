package com.generation.RedSocialMyPets.service;
import com.generation.RedSocialMyPets.models.Publicacion;
import com.generation.RedSocialMyPets.repository.PublicacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicacionesService {

    @Autowired
    private PublicacionesRepository publicacionesRepository;

    public Publicacion obtenerPublicacionPorId(Long idPublicacion) {
        return publicacionesRepository.getReferenceById(idPublicacion);
    }
}



