package com.jpatuto.demo.Services;

import com.jpatuto.demo.Entities.Livre;
import com.jpatuto.demo.Entities.Promotion;
import com.jpatuto.demo.Repositories.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivreServiceImpl implements LivreService {

    @Autowired
    private LivreRepository livreRepository;

    @Override
    public List<Livre> getAllBooks() {
        return livreRepository.findAll();
    }

    @Override
    public void addBook(Livre livre) {
        livreRepository.save(livre);
    }

    @Override
    public void removeBook(int id) {
        livreRepository.deleteById(id);
    }

    @Override
    public Optional<Livre> getBookByid(int id) {
        return livreRepository.findById(id);
    }

    @Override
    public void updateBook(Livre livre) {
        livreRepository.save(livre);
    }

    @Override
    public Optional<Livre> getLivreByName(String name) {
        return livreRepository.findByDesignation(name);
    }

    @Override
    public List<Livre> getLivresBypromo(Promotion promotion) {
        return livreRepository.findLivresByPromotion(promotion);
    }
}
