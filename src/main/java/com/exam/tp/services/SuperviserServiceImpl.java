package com.exam.tp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.exam.tp.model.AgentVendeur;
import com.exam.tp.model.Superviseur;
import com.exam.tp.model.Superviser;
import com.exam.tp.repositories.AgentVendeurRepository;
import com.exam.tp.repositories.SuperviseurRepository;
import com.exam.tp.repositories.SuperviserRepository;

@Service
public class SuperviserServiceImpl implements SuperviserService{
     @Autowired
    private SuperviserRepository SuperviserRepository;
    @Autowired
    private AgentVendeurRepository agentVendeurRepository;
    @Autowired
    private SuperviseurRepository SuperviseurRepository;

    public Superviser create(Superviser data) {
        return SuperviserRepository.save(data);
    }

    public List<Superviser> findAll() {
        return SuperviserRepository.findAll();
    }

    public List<Superviser> findByAgent(String id) {
        Optional<AgentVendeur> agent = agentVendeurRepository.findById(id);
        if (agent.isPresent()) {
            Query query = new Query();
            query.addCriteria(Criteria.where("agentVendeur").is(agent));
            return SuperviserRepository.findByAgentVendeur(agent);
        } else {
            return null;
        }
    }

    public List<Superviser> findBySuperviseur(String id) {
        Optional<Superviseur> superviseur = SuperviseurRepository.findById(id);
        if (superviseur.isPresent()) {
            Query query = new Query();
            query.addCriteria(Criteria.where("Superviseur").is(superviseur));
            return SuperviserRepository.findBySuperviseur(superviseur);
        } else {
            return null;
        }
    }
}
