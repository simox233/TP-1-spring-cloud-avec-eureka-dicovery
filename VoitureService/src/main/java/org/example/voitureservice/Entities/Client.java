package org.example.voitureservice.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    private Long id; // Assurez-vous que cet ID est généré ou affecté d'une manière ou d'une autre
    private String nom;
    private Float age;
}
