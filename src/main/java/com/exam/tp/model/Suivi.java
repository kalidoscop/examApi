package com.exam.tp.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "suivi")
public class Suivi {
    @Id
    private String id;
    private Boutique boutique;
    private AgentVendeur agentVendeur;
    private Date debut_suivi;
    private Date fin_suivi;

}
