package com.exam.tp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.tp.model.Categorie;
import com.exam.tp.repositories.CategorieRepository;

@Service
public class CategorieServiceImpl implements CategorieService{
     @Autowired
    private CategorieRepository CategorieRepository;

    public Categorie create(Categorie data) {
        return CategorieRepository.save(data);
    }

    public Categorie update(Categorie data) {
        return CategorieRepository.save(data);
    }

    public List<Categorie> findAll() {
        return CategorieRepository.findAll();
    }

    public Optional<Categorie> findById(String id) {
        return CategorieRepository.findById(id);
    }

    public void delete(String id) {
        CategorieRepository.deleteById(id);

    }
}
