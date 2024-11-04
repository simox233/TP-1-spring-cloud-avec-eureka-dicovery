package com.example.clientservice.Repositories;

import com.example.clientservice.Entities.Client;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

    @Bean
    default CommandLineRunner initialiserBaseH2(ClientRepository clientRepository){
        return args -> {
            clientRepository.save(new Client(Long.parseLong("1"),"Rabab SELIMANI",Float.parseFloat("23")));
            clientRepository.save(new Client(Long.parseLong("2"),"Amal Rami",Float.parseFloat("22")));
            clientRepository.save(new Client(Long.parseLong("3"),"Samir Safi",Float.parseFloat("22")));

        };
    }
}