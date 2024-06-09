package com.exam.tp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exam.tp.model.Utilisateur;

public interface UtilisateurRepository extends MongoRepository<Utilisateur, String>{

}
