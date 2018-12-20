package com.jpatuto.demo.Repositories;

import com.jpatuto.demo.Entities.Panier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanierRepository extends JpaRepository<Panier,Integer> {
}
