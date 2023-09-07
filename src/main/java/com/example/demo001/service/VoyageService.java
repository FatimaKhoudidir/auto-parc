package com.example.demo001.service;

import com.example.demo001.models.Voyage;
import com.example.demo001.repository.VoyageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VoyageService implements IVoyage{
    @Autowired
    VoyageRepository voyageRepository;
    @Override
    public List<Voyage> getAll() {
        return (List<Voyage>) voyageRepository.findAll();
    }

    @Override
    public Voyage AddVoyage(Voyage voyage) {
        return voyageRepository.save(voyage);
    }
}
