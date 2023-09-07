package com.example.demo001.repository;


import com.example.demo001.models.Category;
import com.example.demo001.models.Repos;
import com.example.demo001.models.Conducteur;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;
import java.util.Set;

@Repository
public interface ConducteurRepository extends CrudRepository<Conducteur,Integer> {
    Optional<Conducteur> findByMatricule(int matricule);


}
