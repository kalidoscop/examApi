package com.exam.tp.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exam.tp.model.AgentVendeur;
import com.exam.tp.model.Superviser;
import com.exam.tp.model.Superviseur;

public interface SuperviserRepository extends MongoRepository<Superviser, String> {
    List<Superviser> findByAgentVendeur(Optional<AgentVendeur> agent);

    List<Superviser> findBySuperviseur(Optional<Superviseur> superviseur);
}
