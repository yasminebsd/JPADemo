package com.jpatuto.demo.Entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id_client;

    private String nom;
    private String prenom;

    @Email
    private String email;
    private String mot_de_passe;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_panier")
    private Panier panier = new Panier();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_client")
    private List<Commande> commandes = null;


    private String role;

    public Client() {
    }

    public Client(String nom, String prenom, String email, String mot_de_passe, Panier panier, List<Commande> commandes) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mot_de_passe = mot_de_passe;
        this.panier = panier;
        this.commandes = commandes;
    }
}
