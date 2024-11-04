package com.example.clientservice;

import com.example.clientservice.Repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientServiceApplication {

    private final ClientRepository clientRepository;

    public ClientServiceApplication(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner initDatabase() {
        return clientRepository.initialiserBaseH2(clientRepository);
    }
}
