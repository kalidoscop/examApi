package com.exam.tp.services;

import java.util.List;
import java.util.Optional;

import com.exam.tp.model.Produit;

public interface ProduitService {
    public Produit create(Produit data);

    public Produit update(Produit data);

    public List<Produit> findAll();

    public Optional<Produit> findById(String id);

    public void delete(String id);
}
