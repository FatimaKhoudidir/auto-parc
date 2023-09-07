package com.example.demo001.controllers;

import com.example.demo001.models.Conducteur;
import com.example.demo001.service.DisponibiliteServiceImp;
import com.example.demo001.service.conductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/driver")
public class ConducteurController {
    @Autowired
    private conductServiceImp conducteurServiceimp;
    @Autowired
    private DisponibiliteServiceImp disponibiliteServiceImp;
    @GetMapping
    public List<Conducteur>getAll(){
        return conducteurServiceimp.getAllConducteur();
    }

    @GetMapping("/{matricule}")
    public Conducteur getById(@PathVariable  int matricule){
        return conducteurServiceimp.getById(matricule);
    }

    @PostMapping
    public Conducteur AddCond(@RequestBody Conducteur cnd){
        return conducteurServiceimp.AddConducteur(cnd);
    }
    @GetMapping("/dispo/{matricule}")
    public boolean getDispoConducteur(@PathVariable int matricule, @RequestBody Date dateD, @RequestBody Date dateF){
        return disponibiliteServiceImp.dispoCond(matricule,dateD,dateF);
    }
    @DeleteMapping("/{matricule}")
    public String DeletConducteur(@PathVariable int matricule){
        conducteurServiceimp.deleteConducteur(matricule);
        return "conducteur est bien supprimé";
    }







}
