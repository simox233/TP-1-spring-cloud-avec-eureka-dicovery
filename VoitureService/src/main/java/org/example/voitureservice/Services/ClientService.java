package org.example.voitureservice.Services;


import org.example.voitureservice.Entities.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="service-client", url = "http://localhost:8088")
public interface ClientService {
    @GetMapping(path="/clients/{id}")
    public Client clientById(@PathVariable  Long id);
}
