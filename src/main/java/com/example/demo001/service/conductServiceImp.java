package com.example.demo001.service;

import com.example.demo001.models.Conducteur;
import com.example.demo001.repository.ConducteurRepository;
import jakarta.persistence.Cacheable;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class conductServiceImp implements conducteurService {
@Autowired
    public ConducteurRepository conducteurRepository;
    @Override
    public List<Conducteur> getAllConducteur() {
      return (List<Conducteur>) conducteurRepository.findAll();
    }

    @Override
    public Conducteur getById(int id) {
        Optional<Conducteur> conducteur = conducteurRepository.findById(id);
        if (conducteur.isPresent())
            return conducteur.get();
        else throw new EntityNotFoundException("conducteur n'existe pas");
    }

    @Override
    public Conducteur AddConducteur(Conducteur cond) {

        return conducteurRepository.save(cond);
    }

    @Override
    public Conducteur update(int id, Conducteur cnd) {
        Conducteur cndToUpdate = conducteurRepository.findById(id).orElseThrow();
        cndToUpdate.setNameCd(cnd.getNameCd());
        cndToUpdate.setPermis(cnd.getPermis());

        return conducteurRepository.save(cndToUpdate);
    }

    @Override
    public String deleteConducteur(int id) {
        conducteurRepository.deleteById(id);
        return "le conducteur de matricule "+id+"est bien supprime";

    }
}
