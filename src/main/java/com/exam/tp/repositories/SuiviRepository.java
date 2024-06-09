package com.exam.tp.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exam.tp.model.AgentVendeur;
import com.exam.tp.model.Boutique;
import com.exam.tp.model.Suivi;

public interface SuiviRepository extends MongoRepository<Suivi,String> {

    List<Suivi> findByAgentVendeur(Optional<AgentVendeur> agent);

    List<Suivi> findByBoutique(Optional<Boutique> boutique);
    
}
