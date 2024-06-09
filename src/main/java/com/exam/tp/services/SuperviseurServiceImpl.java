package com.exam.tp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.tp.model.Superviseur;
import com.exam.tp.repositories.SuperviseurRepository;

@Service
public class SuperviseurServiceImpl implements SuperviseurService  {
    @Autowired
    private SuperviseurRepository SuperviseurRepository;

    public Superviseur create(Superviseur data){
        return SuperviseurRepository.save(data);
    }
    public Superviseur update(Superviseur data){
        return SuperviseurRepository.save(data);
    }
    public List<Superviseur>findAll(){
        return SuperviseurRepository.findAll();
    }
    public Optional<Superviseur>findById(String id){
        return SuperviseurRepository.findById(id);
    }
    public void delete(String id){
        SuperviseurRepository.deleteById(id);
    }
}
