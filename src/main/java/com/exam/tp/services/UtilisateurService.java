package com.exam.tp.services;

import java.util.List;
import java.util.Optional;

import com.exam.tp.model.Utilisateur;

public interface UtilisateurService {
    public Utilisateur create(Utilisateur data);
    public Utilisateur update(Utilisateur data);
    public List<Utilisateur>findAll();
    public Optional<Utilisateur>findById(String id);
    public void delete(String id);
}
