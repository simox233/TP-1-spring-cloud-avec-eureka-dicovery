package org.example.voitureservice.Services;

import org.example.voitureservice.Entities.Voiture;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VoitureService {

    Voiture enregistrerVoiture(Voiture voiture);
   Voiture trouverVoitureParId(Long id);
    List<Voiture> trouverToutesLesVoitures();
   // List<Voiture> trouverVoituresParClientId(Long clientId);
     Voiture mettreAJourVoiture(Long id, Voiture updatedVoiture) throws Exception;
    void supprimerVoiture(Long id) throws Exception;
}

