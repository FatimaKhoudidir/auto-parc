package com.example.demo001.repository;

import com.example.demo001.models.Category;
import com.example.demo001.models.Conducteur;
import com.example.demo001.models.Vehicule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehiculeRepository extends CrudRepository<Vehicule,String > {
    Optional<Vehicule> findByMatricule(int matricule);

}
