package com.denisnazarov.springboot_api.api_task.service;

import com.denisnazarov.springboot_api.api_task.dto.ClientDto;
import com.denisnazarov.springboot_api.api_task.model.Client;

import java.util.List;

public interface ClientService {

    Client getById(Long id);

    Client create(ClientDto dto);

    Client update(Client client);

    void delete(Long id);

    List<Client> getAll();
}
