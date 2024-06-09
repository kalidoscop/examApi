package com.exam.tp.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exam.tp.model.AgentVendeur;
import com.exam.tp.model.Approvisionnement;
import com.exam.tp.model.Boutique;

public interface ApprovisionnementRepository extends MongoRepository<Approvisionnement, String>{
     List<Approvisionnement> findByAgentVendeur(Optional<AgentVendeur> agent);

    List<Approvisionnement> findByBoutique(Optional<Boutique> boutique);
}
