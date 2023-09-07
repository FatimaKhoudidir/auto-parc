package com.example.demo001.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
@Data
@Getter
@Setter
@AllArgsConstructor @NoArgsConstructor @ToString
@Entity

public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matricule ;

    private String marqueVh ;

    private String modelVh ;
    @ManyToOne
    @JoinColumn(name = "permis")
    private Permis permis ;
    @OneToMany(mappedBy = "veh")
    private Collection<Voyage> voyages ;
    @Enumerated
    private Category type;

}
