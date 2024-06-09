package com.exam.tp.services;

import java.util.List;

import com.exam.tp.model.Suivi;

public interface SuiviService {
    public Suivi create(Suivi data);

    public List<Suivi> findAll();

    public List<Suivi> findByAgent(String id);

    public List<Suivi> findByBoutique(String id);

}
