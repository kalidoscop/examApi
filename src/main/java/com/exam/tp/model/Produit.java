package com.exam.tp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "produits")
public class Produit {

    @Id
    private String id ;
    private String nom_produit ;
    private String code_produit ;
    private Categorie categorie;
    
}
