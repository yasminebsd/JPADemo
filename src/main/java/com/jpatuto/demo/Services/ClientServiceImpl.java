package com.jpatuto.demo.Services;

import com.jpatuto.demo.Entities.Client;
import com.jpatuto.demo.Repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<com.jpatuto.demo.Entities.Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public void addClient(com.jpatuto.demo.Entities.Client client) {
        clientRepository.save(client);
    }

    @Override
    public void removeClient(int id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Optional<com.jpatuto.demo.Entities.Client> getClientByid(int id) {
        return clientRepository.findById(id);
    }

    @Override
    public void updateClient(com.jpatuto.demo.Entities.Client client) {
        clientRepository.save(client);
    }

    @Override
    public Optional<Client> getClientByEmail(String email) {
        return clientRepository.findByEmail(email);
    }
}
