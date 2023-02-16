package com.denisnazarov.springboot_api.api_task.model;

import com.denisnazarov.springboot_api.api_task.dto.ClientDto;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "clients")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "created_at")
    LocalDate createdAt = LocalDate.now();

    public static Client createClient(ClientDto dto){
        Client client = new Client();
        client.setName(dto.getName());
        client.setEmail(dto.getEmail());
        client.setPassword(dto.getPassword());
        client.setCreatedAt(LocalDate.now());

        return client;
    }


}
