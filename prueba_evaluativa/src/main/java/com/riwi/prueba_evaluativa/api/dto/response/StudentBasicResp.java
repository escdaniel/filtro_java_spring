package com.riwi.prueba_evaluativa.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class StudentBasicResp {
    private Long id;
    private String name;
    private String email;
    private Boolean active;
}
