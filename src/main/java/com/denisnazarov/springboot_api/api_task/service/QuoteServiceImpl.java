package com.denisnazarov.springboot_api.api_task.service;


import com.denisnazarov.springboot_api.api_task.dto.QuoteDto;
import com.denisnazarov.springboot_api.api_task.model.Quote;
import com.denisnazarov.springboot_api.api_task.repository.QuoteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class QuoteServiceImpl implements QuoteService {

    @Autowired
    QuoteRepository quoteRepository;


    @Override
    public Quote getById(Long id) {
        Quote quote = quoteRepository.findById(id).get();
        log.info("IN QuoteServiceImpl getById {}", quote);
        return quote;
    }

    @Override
    public Quote create(QuoteDto dto) {
        return quoteRepository.save(Quote.builder()
                .content(dto.getContent())
                .build());
    }



    public Quote update(Quote quote){return quoteRepository.save(quote);}

    @Override
    public void delete(Long id) {
        quoteRepository.deleteById(id);
    }

    @Override
    public List<Quote> getAll() {
        return quoteRepository.findAll();
    }
}
