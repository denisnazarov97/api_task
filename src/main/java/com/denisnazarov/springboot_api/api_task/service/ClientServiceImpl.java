package com.denisnazarov.springboot_api.api_task.service;

import com.denisnazarov.springboot_api.api_task.dto.ClientDto;
import com.denisnazarov.springboot_api.api_task.model.Client;
import com.denisnazarov.springboot_api.api_task.repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client getById(Long id) {
        Client client = clientRepository.findById(id).get();
        return client;
    }

    @Override
    public Client create(ClientDto dto) {
        return clientRepository.save(Client.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .createdAt(LocalDate.now())
                .build());
    }

    public Client update(Client client){
        return clientRepository.save(client);
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }
}




