package com.example.demo001.service;

import com.example.demo001.models.Conducteur;
import com.example.demo001.models.Vehicule;
import com.example.demo001.models.Voyage;

public interface IAffectation {
    public void saveConducteur(int matricule , Long idv);
    public void saveVehicule( int matricule , Long idv );
}
