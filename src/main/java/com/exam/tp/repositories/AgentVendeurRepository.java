package com.exam.tp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exam.tp.model.AgentVendeur;

public interface AgentVendeurRepository extends MongoRepository<AgentVendeur, String>{
    
}
