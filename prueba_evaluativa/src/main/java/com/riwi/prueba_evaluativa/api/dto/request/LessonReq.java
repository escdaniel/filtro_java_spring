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

public class LessonReq {
    @NotBlank(message = "El titulo es requerido")
    @Size(
        min = 3,
        max = 100,
        message = "El titulo debe tener entre 0 y 100 caracteres"

    )
    private String title;
    private String content;
    private Long class_id;
    private Boolean active;

}
