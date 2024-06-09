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
@Document(collection = "vente")
public class Vente {
    @Id
    private String id;
    private Boutique boutique;
    private Produit produit;
    private int qte_vendue;
    private Date date_vente;
}
