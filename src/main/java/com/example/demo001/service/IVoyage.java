package com.example.demo001.service;

import com.example.demo001.models.Voyage;

import java.util.List;

public interface IVoyage {
    public List<Voyage> getAll();
    public Voyage AddVoyage(Voyage voyage);
}
