package com.exam.tp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.tp.model.Utilisateur;
import com.exam.tp.repositories.UtilisateurRepository;

@Service
public class UtilisateurServiceImpl implements UtilisateurService{
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public Utilisateur create(Utilisateur data){
        return utilisateurRepository.save(data);
    }
    public Utilisateur update(Utilisateur data){
        return utilisateurRepository.save(data);
    }
    public List<Utilisateur>findAll(){
        return utilisateurRepository.findAll();
    }
    public Optional<Utilisateur>findById(String id){
        return utilisateurRepository.findById(id);
    }
    public void delete(String id){
        utilisateurRepository.deleteById(id);
    }

}
