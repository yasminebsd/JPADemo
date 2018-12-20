package com.jpatuto.demo.Services;

import com.jpatuto.demo.Entities.Panier;
import com.jpatuto.demo.Repositories.PanierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PanierServiceImpl implements PanierService {

    @Autowired
    private PanierRepository panierRepository;

    @Override
    public void addPanier(Panier panier) {
        panierRepository.save(panier);
    }

    @Override
    public void removePanier(int id) {
        panierRepository.deleteById(id);
    }

    @Override
    public Optional<Panier> getPanierByid(int id) {
        return panierRepository.findById(id);
    }

    @Override
    public void updatePanier(Panier panier) {
        panierRepository.save(panier);
    }
}
