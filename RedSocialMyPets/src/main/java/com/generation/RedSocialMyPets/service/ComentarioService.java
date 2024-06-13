package com.generation.RedSocialMyPets.service;
import com.generation.RedSocialMyPets.models.Comentario;
import com.generation.RedSocialMyPets.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComentarioService {
    @Autowired
    private ComentarioRepository comentarioRepository;
    public Comentario obtenerComentarioId(Long ComentarioId) {
        return comentarioRepository.getReferenceById(ComentarioId);
    }
}
