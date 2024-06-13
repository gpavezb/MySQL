package com.generation.RedSocialMyPets.service;
import com.generation.RedSocialMyPets.models.Especie;
import com.generation.RedSocialMyPets.repository.EspecieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EspecieService {

    @Autowired
    private EspecieRepository especieRepository;
    public Especie obtenerEspecieId(Long idEspecie) {
        return especieRepository.getReferenceById(idEspecie);
    }
}
