package com.exam.tp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.tp.model.Suivi;
import com.exam.tp.services.SuiviService;

@RestController
@RequestMapping("/suivi")
public class SuiviController {
    @Autowired
    private SuiviService  SuiviService;

    @PostMapping("/new")
    public Suivi createSuivi(@RequestBody Suivi suivi){
        return SuiviService.create(suivi);
    }

    @GetMapping("/list")
    public List<Suivi> findAllSuivi(){
        return SuiviService.findAll();
    }
    @GetMapping("/agent/{id}")
    public List<Suivi> findByAgent(@PathVariable String id){
        return SuiviService.findByAgent(id);
    }
    @GetMapping("/boutique/{id}")
    public List<Suivi> findByBoutique(@PathVariable String id){
        return SuiviService.findByBoutique(id);
    }
}
