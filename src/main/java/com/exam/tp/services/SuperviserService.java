package com.exam.tp.services;

import java.util.List;

import com.exam.tp.model.Superviser;

public interface SuperviserService {
    public Superviser create(Superviser data);

    public List<Superviser> findAll();

    public List<Superviser> findByAgent(String id);

    public List<Superviser> findBySuperviseur(String id);
}
