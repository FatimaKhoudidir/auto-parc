package com.example.demo001.controllers;

import com.example.demo001.models.Permis;
import com.example.demo001.service.permisServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/permis")
public class PermisController {
    @Autowired
    private permisServiceImp permisService;
    @GetMapping
    public List<Permis>getAll(){
        return permisService.getPermis();
    }
    @PostMapping
    public Permis AddPermis(Permis permis){
        return permisService.addPermis(permis);
    }

}
