package com.example.demo001.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collection;

@Data
@AllArgsConstructor @NoArgsConstructor @ToString
@Entity

public class Conducteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matricule;

    private String nameCd ;
    @ManyToOne
    private Permis permis ;
    @OneToMany(mappedBy = "cond")
    private Collection<Voyage> voyageSet ;


}
