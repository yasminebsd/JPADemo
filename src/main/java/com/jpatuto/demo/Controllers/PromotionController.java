package com.jpatuto.demo.Controllers;

import com.jpatuto.demo.Entities.Promotion;
import com.jpatuto.demo.Services.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/promotion")
public class PromotionController {

    @Autowired
    private PromotionService promotionService;

    @GetMapping
    public List<Promotion> getAllPromos(){
        return promotionService.getAllPromos();
    }

    @PostMapping
    public void addNewPromo(@RequestBody Promotion promotion){
        promotionService.addPromo(promotion);
    }

    @PutMapping("/{id}")
    public void updatePromo(@PathVariable int id, @RequestBody Promotion promotion){
        promotionService.updatePromo(promotion);
    }

    @GetMapping("/{id}")
    public Optional<Promotion> getPromoById(@PathVariable int id){
        return promotionService.getPromoByid(id);
    }

    @DeleteMapping("/{id}")
    public void deletePromo(@PathVariable int id){
        promotionService.removePromo(id);
    }
}
