package com.exam.tp.services;

import java.util.List;

import com.exam.tp.model.Approvisionnement;

public interface ApprovisionnementService {
    public Approvisionnement create(Approvisionnement data);

    public List<Approvisionnement> findAll();
}
