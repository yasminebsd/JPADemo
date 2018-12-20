package com.jpatuto.demo.Services;

import com.jpatuto.demo.Entities.Client;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    public List<Client> getAllClients();
    public void addClient(Client client);
    public void removeClient(int id);
    public Optional<Client> getClientByid(int id);
    public void updateClient(Client client);
    public Optional<Client> getClientByEmail(String email);
}
