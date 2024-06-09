package com.exam.tp.services;

import java.util.List;

import com.exam.tp.model.Vente;

public interface VenteService {
 public Vente create(Vente data);

    public List<Vente> findAll();

    public List<Vente> findByProduit(String id);

    public List<Vente> findByBoutique(String id);
    
}
