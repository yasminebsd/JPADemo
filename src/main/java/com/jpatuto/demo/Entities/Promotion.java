package com.jpatuto.demo.Entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "promotion")
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id_promo;
    private int valeur;
    private Date debut_promo;
    private Date fin_promo;

    @OneToMany
    @JoinColumn(name = "id-promo")
    @Transient
    private List<Livre> livres = new ArrayList<>();
}
