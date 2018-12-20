package com.jpatuto.demo.Services;

import com.jpatuto.demo.Entities.Livre;
import com.jpatuto.demo.Entities.Promotion;

import java.util.List;
import java.util.Optional;

public interface LivreService {

    public List<Livre> getAllBooks();
    public void addBook(Livre livre);
    public void removeBook(int id);
    public Optional<Livre> getBookByid(int id);
    public void updateBook(Livre livre);
    public Optional<Livre> getLivreByName(String name);
    public List<Livre> getLivresBypromo(Promotion promotion);
}
