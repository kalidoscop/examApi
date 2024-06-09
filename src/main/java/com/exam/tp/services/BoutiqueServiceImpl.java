package com.exam.tp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.tp.model.Boutique;
import com.exam.tp.repositories.BoutiqueRepository;

@Service
public class BoutiqueServiceImpl implements BoutiqueService {
    @Autowired
    private BoutiqueRepository boutiqueRepository;

    public Boutique create(Boutique data){
        return boutiqueRepository.save(data);
    }
    public Boutique update(Boutique data){
        return boutiqueRepository.save(data);
    }
    public List<Boutique>findAll(){
        return boutiqueRepository.findAll();
    }
    public Optional<Boutique>findById(String id){
        return boutiqueRepository.findById(id);
    }
    public void delete(String id){
        boutiqueRepository.deleteById(id);
    }
}
