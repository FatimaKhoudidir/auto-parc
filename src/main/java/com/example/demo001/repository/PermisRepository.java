package com.example.demo001.repository;

import com.example.demo001.models.Category;
import com.example.demo001.models.Permis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PermisRepository extends CrudRepository<Permis, Category> {
}
