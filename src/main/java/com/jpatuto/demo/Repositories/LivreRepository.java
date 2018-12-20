package com.jpatuto.demo.Repositories;

import com.jpatuto.demo.Entities.Livre;
import com.jpatuto.demo.Entities.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LivreRepository extends JpaRepository<Livre,Integer> {

    Optional<Livre> findByDesignation(String name);
    List<Livre> findLivresByPromotion(Promotion promotion);
}
