package com.example.demo001.service;

import com.example.demo001.models.Conducteur;
import com.example.demo001.models.Permis;
import com.example.demo001.models.Vehicule;
import com.example.demo001.repository.ConducteurRepository;
import com.example.demo001.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ConformiteServiceImp implements IConformite{
    @Autowired
    private ConducteurRepository conducteurRepository;
    @Autowired
    private VehiculeRepository vehiculeRepository;
    @Override
    public boolean isConformCond(int matricule, String type) {
        Conducteur conducteur = conducteurRepository.findByMatricule(matricule).get();
        Permis permis = conducteur.getPermis();
        ;
        if (permis.getCategory().equals(type))
            return true;
        else
            return false;
    }

    @Override
    public boolean isConformVehic(int matricule, String type) {
        Vehicule vehicule = vehiculeRepository.findByMatricule(matricule).get();
        if(vehicule.getType().equals(type))
            return true ;
        else
            return false;
    }
} 
