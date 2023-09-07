package com.example.demo001.service;

import com.example.demo001.models.Vehicule;

import java.util.List;

public interface IVehiculeService {
    public List<Vehicule> gettAll();
    public Vehicule AddVehicule(Vehicule vehicule);
}
