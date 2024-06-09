package com.exam.tp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.tp.model.Approvisionnement;
import com.exam.tp.repositories.ApprovisionnementRepository;

@Service
public class ApprovisionnementServiceImpl implements ApprovisionnementService{
    @Autowired
    private ApprovisionnementRepository ApprovisionnementRepository;

    public Approvisionnement create(Approvisionnement data) {
        return ApprovisionnementRepository.save(data);
    }

    public List<Approvisionnement> findAll() {
        return ApprovisionnementRepository.findAll();
    }
}
