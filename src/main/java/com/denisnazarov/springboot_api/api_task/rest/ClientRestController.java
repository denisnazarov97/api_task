package com.denisnazarov.springboot_api.api_task.rest;

import com.denisnazarov.springboot_api.api_task.dto.ClientDto;
import com.denisnazarov.springboot_api.api_task.model.Client;
import com.denisnazarov.springboot_api.api_task.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientRestController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<Client> create(@RequestBody ClientDto dto){

        if (dto == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(clientService.create(dto), HttpStatus.OK);
    }

//    @GetMapping
//    public ResponseEntity<List<Client>> getAll(){
//        List <Client> clients = this.clientService.getAll();
//
//        if(clients.isEmpty()){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//        return new ResponseEntity<>(clients, HttpStatus.OK);
//    }
//
//    @PutMapping
//    public ResponseEntity<Client> updateClient(@RequestBody Client client){
//        return new ResponseEntity<>(clientService.update(client), HttpStatus.OK);
//    }
//
//    @DeleteMapping("/{id}")
//    public HttpStatus delete(@PathVariable Long id){
//        clientService.delete(id);
//        return HttpStatus.OK;
//    }
}
