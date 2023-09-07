package com.example.demo001.service;

import java.time.LocalDateTime;
import java.util.Date;

public interface IDesponibilite {
    public boolean dispoCond(int matricule, Date dateD, Date dateF);



    public boolean dispoVehic(int matricule, Date dateD, Date dateF);

}
