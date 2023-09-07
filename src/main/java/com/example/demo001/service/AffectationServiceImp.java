package com.example.demo001.service;


import com.example.demo001.models.Conducteur;
import com.example.demo001.models.Permis;
import com.example.demo001.models.Vehicule;
import com.example.demo001.models.Voyage;
import com.example.demo001.repository.ConducteurRepository;
import com.example.demo001.repository.VehiculeRepository;
import com.example.demo001.repository.VoyageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class AffectationServiceImp implements IAffectation{
    @Autowired
    private VoyageRepository voyageRepository;
    @Autowired
    private ConducteurRepository conducteurRepository;

    @Autowired
    private VehiculeRepository vehiculeRepository;


    DisponibiliteServiceImp dispo = new DisponibiliteServiceImp();
    ConformiteServiceImp conf = new ConformiteServiceImp();
    @Override
    public void saveConducteur(int matricule , Long idv) {
       Optional<Conducteur> cond = conducteurRepository.findByMatricule(matricule);
        Permis permis =cond.get().getPermis();
        String type = String.valueOf(permis.getCategory());
        Optional<Voyage> voyage = voyageRepository.findById(idv);
        Date dateD = voyage.get().getDateD();
        Date dateF = voyage.get().getDateF();

        if(dispo.dispoCond(matricule, dateD, dateF) && conf.isConformCond(matricule, type))
            voyageRepository.save(voyage.get());
    }



    @Override
    public void saveVehicule(int matricule , Long idv) {
        Optional<Vehicule> veh = vehiculeRepository.findByMatricule(matricule);
        int mat = (int) veh.get().getMatricule();
        Permis permis =veh.get().getPermis();
        String type = String.valueOf(permis.getCategory());
        Optional<Voyage> voyage = voyageRepository.findById(idv);
        Date dateD = voyage.get().getDateD();
        Date dateF = voyage.get().getDateF();

        if(dispo.dispoVehic(mat, dateD, dateF) && conf.isConformVehic(mat, type))
            voyageRepository.save(voyage.get());

    }
}
