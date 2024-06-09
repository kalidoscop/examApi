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
@Document(collection = "superviser")
public class Superviser {
    @Id
    private String id;
    private Superviseur superviseur;
    private AgentVendeur agentVendeur;
    private Date debut_supervis;
    private Date fin_supervis;
}
