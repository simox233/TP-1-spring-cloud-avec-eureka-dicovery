package com.example.clientservice.Controllers;

import com.example.clientservice.Entities.Client;
import com.example.clientservice.Repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    public ClientRepository clientRepository;

    @GetMapping("/clients")
    public List findAll(){
        return clientRepository.findAll();
    }

    @GetMapping("/clients/{id}")
    public Client findById(@PathVariable Long id) throws
            Exception{
        return this.clientRepository.findById(id).orElseThrow(()
                -> new Exception("Client Inexistant") );
    }

}
