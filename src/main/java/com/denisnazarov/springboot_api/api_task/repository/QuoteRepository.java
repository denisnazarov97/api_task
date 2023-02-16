package com.denisnazarov.springboot_api.api_task.repository;

import com.denisnazarov.springboot_api.api_task.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
}
