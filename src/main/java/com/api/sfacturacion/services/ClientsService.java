package com.api.sfacturacion.services;

import com.api.sfacturacion.entities.Clients;
import com.api.sfacturacion.repositories.ClientsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientsService {

    private final ClientsRepository clientsRepository;

    public List<Clients> findAll() {

        return clientsRepository.findAll();
    }

    public Clients findById(Long id) {
        return clientsRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontró el cliente con ID " + id));
    }

    public void saveClients(Clients clients) {
        clientsRepository.save(clients);
    }

    public void deleteById(Long id) {
        clientsRepository.deleteById(id);
    }


}
