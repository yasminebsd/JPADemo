package com.jpatuto.demo.Entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id_livre;
    private String designation;
    private String auteur;
    @Min(value = 0, message = "Le prix doit être une valeur positive")
    private double prix;
    @Min(value = 0, message = "La quantité ne peut pas être une valeur négative")
    private int quantite;

    @ManyToOne
    @JoinColumn(name = "id_promo")
    private Promotion promotion;

    @ManyToMany(mappedBy = "livres")
    private List<Panier> paniers = new ArrayList<>();
}
