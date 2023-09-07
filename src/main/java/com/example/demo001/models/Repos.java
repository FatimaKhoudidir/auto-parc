package com.example.demo001.models;

import jakarta.persistence.*;

import java.util.Date;

public class Repos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date dateDebut;
    private Date dateFin;
    @ManyToOne
    @JoinColumn(name = "matricule")
    private Conducteur conducteur;

}
