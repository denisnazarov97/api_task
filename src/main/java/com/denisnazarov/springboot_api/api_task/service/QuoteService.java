package com.denisnazarov.springboot_api.api_task.service;

import com.denisnazarov.springboot_api.api_task.dto.QuoteDto;
import com.denisnazarov.springboot_api.api_task.model.Quote;

import java.util.List;
import java.util.Optional;

public interface QuoteService {

    Quote getById(Long id);

    Quote update(Quote quote);

    Quote create(QuoteDto dto);

    void delete(Long id);

    List<Quote> getAll();
}
