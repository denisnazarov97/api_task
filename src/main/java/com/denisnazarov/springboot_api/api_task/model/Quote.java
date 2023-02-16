package com.denisnazarov.springboot_api.api_task.model;

import com.denisnazarov.springboot_api.api_task.dto.QuoteDto;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldNameConstants;

import java.time.LocalDate;

@Entity
@Table(name = "quotes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldNameConstants
public class Quote{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="client")
    private Client client;
    @Column(name = "content")
    private String content;
    @Column(name = "created_at")
    LocalDate createdOrUpdatedAt = LocalDate.now();

    public static Quote createQuote(QuoteDto dto, Client client){
        Quote quote = new Quote();
        quote.setClient(client);
        quote.setContent(dto.getContent());
        quote.setCreatedOrUpdatedAt(LocalDate.now());
        return quote;

    }
}
