package com.jpatuto.demo.Controllers;

import com.jpatuto.demo.Entities.Livre;
import com.jpatuto.demo.Services.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class LivreController {

    @Autowired
    private LivreService livreService;

    @GetMapping
    public List<Livre> getAllBooks(){
        return livreService.getAllBooks();
    }

    @PostMapping
    public void addNewBook(@RequestBody Livre livre){
        livreService.addBook(livre);
    }

    @PutMapping("/{id}")
    public void updateBook(@PathVariable int id, @RequestBody Livre livre){
        livreService.updateBook(livre);
    }

    @GetMapping("/{id}")
    public Optional<Livre> getBookById(@PathVariable int id){
        return livreService.getBookByid(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id){
        livreService.removeBook(id);
    }
}
