package com.jpatuto.demo.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
/*We add this annotation to avoid the problem with lazy loading via the hibernate proxy object.
otherwise it will show an error saying no serializer found
The problem is that entities are loaded lazily and serialization happens before they get loaded fully
 Got around it by annotating the class having lazy loaded private properties with the above annotation*/
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Panier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id_panier;
    @Min(value = 0, message = "Le nombre d'éléments doit être un entier positif")
    private int nombre_elements = 0;

   /* @OneToOne(mappedBy = "panier", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Client client;*/

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "Livre_paniers",
            joinColumns = @JoinColumn(name = "id_panier"),
            inverseJoinColumns = @JoinColumn(name = "id_livre")
    )
    private List<Livre> livres = new ArrayList<>();
}
