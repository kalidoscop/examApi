package com.exam.tp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.tp.model.Approvisionnement;
import com.exam.tp.services.ApprovisionnementService;

@RestController
@RequestMapping("/approvisionnement")
public class ApprovisionnementController {
    @Autowired
    private ApprovisionnementService  approvisionnementService;

    @PostMapping("/new")
    public Approvisionnement createApprovisionnement(@RequestBody Approvisionnement approvisionnement){
        return approvisionnementService.create(approvisionnement);
    }

    @GetMapping("/list")
    public List<Approvisionnement> findAllApprovisionnement(){
        return approvisionnementService.findAll();
    }
}
