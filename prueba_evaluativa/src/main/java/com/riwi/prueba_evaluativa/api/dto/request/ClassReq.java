package com.riwi.prueba_evaluativa.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClassReq {
    @NotBlank (message = "El nombre es requerido")
    @Size(
        min = 3,
        max = 100,
        message = "El nombre debe tener entre 0 y 100 caracteres"
    )
    private String name;
    private String description;
    private Boolean active;
}