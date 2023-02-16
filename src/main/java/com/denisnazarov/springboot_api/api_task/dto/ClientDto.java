package com.denisnazarov.springboot_api.api_task.dto;

import lombok.Data;
import lombok.experimental.FieldNameConstants;

@Data
@FieldNameConstants
public class ClientDto {
    private Long clientId;
    private String name;
    private String email;
    private String password;
}
