package com.example.demo001.repository;


import com.example.demo001.models.Voyage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoyageRepository extends CrudRepository<Voyage,Long> {
    Optional<Voyage> findById(Long id );
}
