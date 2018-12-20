package com.jpatuto.demo.Services;

import com.jpatuto.demo.Entities.Promotion;
import com.jpatuto.demo.Repositories.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PromotionServiceImpl implements PromotionService{

    @Autowired
    private PromotionRepository promotionRepository;

    @Override
    public List<Promotion> getAllPromos() {
        return  promotionRepository.findAll();
    }

    @Override
    public void addPromo(Promotion promotion) {
        promotionRepository.save(promotion);
    }

    @Override
    public void removePromo(int id) {
        promotionRepository.deleteById(id);
    }

    @Override
    public Optional<Promotion> getPromoByid(int id) {
        return promotionRepository.findById(id);
    }

    @Override
    public void updatePromo(Promotion promotion) {
        promotionRepository.save(promotion);
    }
}
