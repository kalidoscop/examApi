package com.exam.tp.services;

import java.util.List;
import java.util.Optional;

import com.exam.tp.model.Boutique;

public interface BoutiqueService {

    public Boutique create(Boutique data);
    public Boutique update(Boutique data);
    public List<Boutique>findAll();
    public Optional<Boutique>findById(String id);
    public void delete(String id);
}
