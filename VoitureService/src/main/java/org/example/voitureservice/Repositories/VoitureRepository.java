package org.example.voitureservice.Repositories;

import org.example.voitureservice.Entities.Voiture;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VoitureRepository extends JpaRepository<Voiture,Long> {

    List<Voiture> findByClientId(Long id);
}
