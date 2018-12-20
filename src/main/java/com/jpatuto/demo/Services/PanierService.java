package com.jpatuto.demo.Services;

import com.jpatuto.demo.Entities.Panier;

import java.util.List;
import java.util.Optional;

public interface PanierService {

    public void addPanier(Panier panier);
    public void removePanier(int id);
    public Optional<Panier> getPanierByid(int id);
    public void updatePanier(Panier panier);
}
