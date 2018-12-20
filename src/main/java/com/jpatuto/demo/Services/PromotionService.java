package com.jpatuto.demo.Services;

import com.jpatuto.demo.Entities.Promotion;

import java.util.List;
import java.util.Optional;

public interface PromotionService {

    public List<Promotion> getAllPromos();
    public void addPromo(Promotion promotion);
    public void removePromo(int id);
    public Optional<Promotion> getPromoByid(int id);
    public void updatePromo(Promotion promotion);
}
