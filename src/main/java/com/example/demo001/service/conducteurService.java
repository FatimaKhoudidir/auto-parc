package com.example.demo001.service;

import com.example.demo001.models.Conducteur;

import java.util.List;

public interface conducteurService {
    public List<Conducteur> getAllConducteur();
    public Conducteur getById(int id);
    public Conducteur AddConducteur(Conducteur cond);
    public Conducteur update(int id, Conducteur cnd);
    public String deleteConducteur(int id);

}
