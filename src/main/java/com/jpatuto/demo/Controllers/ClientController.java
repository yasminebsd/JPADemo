package com.jpatuto.demo.Controllers;

import com.jpatuto.demo.Entities.Client;
import com.jpatuto.demo.Entities.Panier;
import com.jpatuto.demo.Services.ClientService;
import com.jpatuto.demo.Services.PanierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private PanierService panierService;

    @GetMapping
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }

    @PostMapping
    public void addClient(@RequestBody Client client){
        Panier p = new Panier();
        panierService.addPanier(p);
        client.setPanier(p);
        clientService.addClient(client);
    }

    @PutMapping("/{id}")
    public void updateClient(@PathVariable int id, @RequestBody Client client){
        clientService.updateClient(client);
    }

    @GetMapping("/{id}")
    public Optional<Client> getClientById(@PathVariable int id){
        return clientService.getClientByid(id);
    }

    @GetMapping("/byemail/{email}")
    public Optional<Client> getClientById(@PathVariable String email){
      return clientService.getClientByEmail(email);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable int id){
        clientService.removeClient(id);
    }
}
