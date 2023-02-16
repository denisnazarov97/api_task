package com.denisnazarov.springboot_api.api_task.dto;

import lombok.Data;
import lombok.experimental.FieldNameConstants;

@Data
@FieldNameConstants
public class QuoteDto {
    private Long clientId;
    private String content;
}
