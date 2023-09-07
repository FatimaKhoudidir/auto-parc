package com.example.demo001.service;

import com.example.demo001.models.Voyage;
import com.example.demo001.repository.VoyageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;



@Service
public class DisponibiliteServiceImp implements IDesponibilite{
    @Autowired
    private VoyageRepository voyageRepository;

    @Override
    public boolean dispoCond(int matricule, Date dateD, Date dateF) {
        boolean exist = false;
        Iterable<Voyage> voyages = voyageRepository.findAll();
        for (Voyage v : voyages) {
            if (v.getCond().getMatricule()==matricule
                    && v.getDateD().before(dateD)
                    && v.getDateD().after(dateF)
                    && v.getDateF().before(dateD) )
                exist = true;
            else
                exist = false;

        }

       return exist;
    }



    @Override
    public boolean dispoVehic(int matricule, Date dateD, Date dateF) {
        boolean exist = false;
        Iterable<Voyage> voyages = voyageRepository.findAll();
        for (Voyage v : voyages) {
            if (v.getVeh().getMatricule()==matricule
                    && v.getDateD().before(dateD)
                    && v.getDateD().after(dateF)
                    && v.getDateF().before(dateD) )
                exist = true;
            else
                exist = false;
        }
        return exist;
    }
}
