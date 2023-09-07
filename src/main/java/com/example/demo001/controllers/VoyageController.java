package com.example.demo001.controllers;

import com.example.demo001.models.Voyage;
import com.example.demo001.service.VoyageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/voyage")
public class VoyageController {
    @Autowired
    VoyageService voyageService;
    @GetMapping
    public List<Voyage> getAll(){
        return voyageService.getAll();
    }
    @PostMapping
    public Voyage AddVoyage(Voyage voyage){
        return voyageService.AddVoyage(voyage);
    }
}
