package com.exam.tp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.tp.model.Produit;
import com.exam.tp.repositories.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService {
    @Autowired
    private ProduitRepository ProduitRepository;

    public Produit create(Produit data) {
        return ProduitRepository.save(data);
    }

    public Produit update(Produit data) {
        return ProduitRepository.save(data);
    }

    public List<Produit> findAll() {
        return ProduitRepository.findAll();
    }

    public Optional<Produit> findById(String id) {
        return ProduitRepository.findById(id);
    }

    public void delete(String id) {
        ProduitRepository.deleteById(id);

    }

}
