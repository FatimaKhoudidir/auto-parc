package com.example.demo001.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor @NoArgsConstructor @ToString
@Entity
public class Voyage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id  ;
    @Column(name = "dateD")
    private Date dateD ;
    @Column(name = "dateF")
    private Date dateF ;
     @ManyToOne
    private Vehicule veh ;
    @ManyToOne
    //@JoinColumn(name = "matriculeCd")
    private Conducteur cond ;



}
