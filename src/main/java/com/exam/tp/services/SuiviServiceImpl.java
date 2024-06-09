package com.exam.tp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.exam.tp.model.AgentVendeur;
import com.exam.tp.model.Boutique;
import com.exam.tp.model.Suivi;
import com.exam.tp.repositories.AgentVendeurRepository;
import com.exam.tp.repositories.BoutiqueRepository;
import com.exam.tp.repositories.SuiviRepository;

@Service
public class SuiviServiceImpl implements SuiviService {

    @Autowired
    private SuiviRepository suiviRepository;
    @Autowired
    private AgentVendeurRepository agentVendeurRepository;
    @Autowired
    private BoutiqueRepository boutiqueRepository;

    public Suivi create(Suivi data) {
        return suiviRepository.save(data);
    }

    public List<Suivi> findAll() {
        return suiviRepository.findAll();
    }

    public List<Suivi> findByAgent(String id) {
        Optional<AgentVendeur> agent = agentVendeurRepository.findById(id);
        if (agent.isPresent()) {
            Query query = new Query();
            query.addCriteria(Criteria.where("agentVendeur").is(agent));
            return suiviRepository.findByAgentVendeur(agent);
        } else {
            return null;
        }
    }

    public List<Suivi> findByBoutique(String id) {
        Optional<Boutique> boutique = boutiqueRepository.findById(id);
        if (boutique.isPresent()) {
            Query query = new Query();
            query.addCriteria(Criteria.where("boutique").is(boutique));
            return suiviRepository.findByBoutique(boutique);
        } else {
            return null;
        }
    }
}
