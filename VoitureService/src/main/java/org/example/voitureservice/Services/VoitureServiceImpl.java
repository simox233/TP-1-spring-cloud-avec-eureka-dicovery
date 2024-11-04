package org.example.voitureservice.Services;

import org.example.voitureservice.Entities.Voiture;
import org.example.voitureservice.Repositories.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoitureServiceImpl implements VoitureService{

    @Autowired
    private VoitureRepository voitureRepository;

    @Override
    public Voiture enregistrerVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }

    @Override
    public Voiture trouverVoitureParId(Long id) {
        return null;
    }


    @Override
    public List<Voiture> trouverToutesLesVoitures() {
        return voitureRepository.findAll();
    }

    @Override
    public Voiture mettreAJourVoiture(Long id, Voiture updatedVoiture) throws Exception {
        return null;
    }


    @Override
    public void supprimerVoiture(Long id) throws Exception {

    }


}
