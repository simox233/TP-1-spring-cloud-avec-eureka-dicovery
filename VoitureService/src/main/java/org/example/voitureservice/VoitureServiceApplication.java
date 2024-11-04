package org.example.voitureservice;

import org.example.voitureservice.Entities.Client;
import org.example.voitureservice.Entities.Voiture;
import org.example.voitureservice.Repositories.VoitureRepository;
import org.example.voitureservice.Services.ClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@SpringBootApplication
public class VoitureServiceApplication {


    private final VoitureRepository voitureRepository;
    private final ClientService clientService;

    public VoitureServiceApplication(VoitureRepository voitureRepository, ClientService clientService) {
        this.voitureRepository = voitureRepository;
        this.clientService = clientService; // Ajout de ClientService ici
    }

    public static void main(String[] args) {
        SpringApplication.run(VoitureServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner initDatabase() {
        return args -> {

            Client c1 = clientService.clientById(2L);
            Client c2 = clientService.clientById(1L);


            System.out.println("**************************");
            System.out.println("Id est :" + c2.getId());
            System.out.println("Nom est :" + c2.getNom());
            System.out.println("**************************");
            System.out.println("**************************");
            System.out.println("Id est :" + c1.getId());
            System.out.println("Nom est :" + c1.getNom());
            System.out.println("Age est :" + c1.getAge());
            System.out.println("**************************");

            // Ajout des voitures avec l'association Client
            voitureRepository.save(new Voiture(Long.parseLong("1"), "Toyota", "A 25 333", "Corolla", 1L, c2));
            voitureRepository.save(new Voiture(Long.parseLong("2"), "Renault", "B 6 3456", "Megane", 1L, c2));
            voitureRepository.save(new Voiture(Long.parseLong("3"), "Peugeot", "A 55 4444", "301", 2L, c1));
        };
    }

}
