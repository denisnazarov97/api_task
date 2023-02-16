package com.denisnazarov.springboot_api.api_task.repository;

import com.denisnazarov.springboot_api.api_task.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
