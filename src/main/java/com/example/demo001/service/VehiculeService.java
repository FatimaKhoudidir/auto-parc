package com.example.demo001.service;

import com.example.demo001.models.Vehicule;
import com.example.demo001.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VehiculeService implements IVehiculeService{
    @Autowired
    VehiculeRepository vehiculeRepository;
    @Override
    public List<Vehicule> gettAll() {
        return (List<Vehicule>) vehiculeRepository.findAll();
    }

    @Override
    public Vehicule AddVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }
}

