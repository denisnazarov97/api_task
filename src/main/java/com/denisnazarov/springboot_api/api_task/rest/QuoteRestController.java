package com.denisnazarov.springboot_api.api_task.rest;

import com.denisnazarov.springboot_api.api_task.dto.QuoteDto;
import com.denisnazarov.springboot_api.api_task.model.Client;
import com.denisnazarov.springboot_api.api_task.model.Quote;
import com.denisnazarov.springboot_api.api_task.service.ClientService;
import com.denisnazarov.springboot_api.api_task.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quotes")
public class QuoteRestController {

    @Autowired
    private QuoteService quoteService;

    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<Quote> create(@RequestBody QuoteDto dto){

        if(dto == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Client client = clientService.getById(dto.getClientId());
        Quote newQuote = Quote.createQuote(dto, client);

        return new ResponseEntity<>(quoteService.update(newQuote), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Quote> updateQuote(@RequestBody Quote quote){


        return new ResponseEntity<>(quoteService.update(quote), HttpStatus.OK);
    }






//    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Quote> getQuote(@PathVariable("id") Long quoteId) {
//
//        if (quoteId == null) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//        Quote quote = this.quoteService.getById(quoteId);
//
//        if (quote == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//        return new ResponseEntity<>(quote, HttpStatus.OK);
//    }
//
//    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Quote> saveQuote(@RequestBody @Validated QuoteDto dto) {
//
//        if (dto == null) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//        Client client = clientService.getById(dto.getClientId());
//        Quote newQuote = Quote.createQuote(dto, client);
//
//
//
//        this.quoteService.save(newQuote);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//
//    }
//
//    @PutMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Quote> updateQuote(@RequestBody @Validated Quote quote) {
//
//        if (quote == null) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//        this.quoteService.save(quote);
//        return new ResponseEntity<>(quote, HttpStatus.OK);
//    }
//
//    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Quote> deleteQuote(@PathVariable("id") Long id) {
//
//        Quote quote = this.quoteService.getById(id);
//
//        if (quote == null) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//        this.quoteService.delete(id);
//
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Quote>> getAllQuotes(){
        List<Quote> quotes = this.quoteService.getAll();

        if (quotes.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(quotes, HttpStatus.OK);
    }
}
