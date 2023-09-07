package com.example.demo001.controllers;

import com.example.demo001.models.Vehicule;
import com.example.demo001.repository.VehiculeRepository;
import com.example.demo001.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehicule")
public class VehiculeController {
    @Autowired
    VehiculeService vehiculeService;
    @PostMapping
    public Vehicule addVihicule(Vehicule vh){
        return vehiculeService.AddVehicule(vh);
    }
    @GetMapping
    public List<Vehicule>getAll(){
        return vehiculeService.gettAll();
    }
}
