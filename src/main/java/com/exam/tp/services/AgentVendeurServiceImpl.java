package com.exam.tp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.tp.model.AgentVendeur;
import com.exam.tp.repositories.AgentVendeurRepository;

@Service
public class AgentVendeurServiceImpl implements AgentVendeurService {
    @Autowired
    private AgentVendeurRepository AgentVendeurRepository;

    public AgentVendeur create(AgentVendeur data){
        return AgentVendeurRepository.save(data);
    }
    public AgentVendeur update(AgentVendeur data){
        return AgentVendeurRepository.save(data);
    }
    public List<AgentVendeur>findAll(){
        return AgentVendeurRepository.findAll();
    }
    public Optional<AgentVendeur>findById(String id){
        return AgentVendeurRepository.findById(id);
    }
    public void delete(String id){
        AgentVendeurRepository.deleteById(id);
    }
}
