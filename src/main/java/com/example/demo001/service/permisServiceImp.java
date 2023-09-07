package com.example.demo001.service;

import com.example.demo001.models.Permis;
import com.example.demo001.repository.PermisRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class permisServiceImp implements permisService{
    @Autowired
    PermisRepository permisRepository;

    @Override
    public Permis addPermis(Permis permis) {
        return permisRepository.save(permis);
    }

    @Override
    public List<Permis> getPermis() {
        return (List<Permis>)permisRepository.findAll();
    }


}
