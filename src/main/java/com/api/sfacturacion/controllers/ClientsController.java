package com.api.sfacturacion.controllers;

import com.api.sfacturacion.entities.Clients;
import com.api.sfacturacion.services.ClientsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientsController {

    private final ClientsService clientsService;

    @GetMapping("/clients")
    private List<Clients> findAll() {
        return clientsService.findAll();
    }

    @GetMapping("/clients/{id}")
    public Clients findById(@PathVariable Long id) {
        return clientsService.findById(id);
    }

    @PostMapping("/clients")
    public void saveClients(@RequestBody Clients clients) {
        clientsService.saveClients(clients);
    }

    @PutMapping("/clients/{id}")
    private void editById(@PathVariable Long id, @RequestBody Clients clients) {
        clients.setId(id);
        clientsService.saveClients(clients);
    }

    @DeleteMapping("/clients/{id}")
    public void deleteById(@PathVariable Long id) {
        clientsService.deleteById(id);
    }
}
