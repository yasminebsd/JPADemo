package com.jpatuto.demo.Repositories;

import com.jpatuto.demo.Entities.Livre;
import com.jpatuto.demo.Entities.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion,Integer> {

}
