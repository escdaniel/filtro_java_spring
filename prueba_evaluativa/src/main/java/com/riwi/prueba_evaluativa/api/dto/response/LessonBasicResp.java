package com.riwi.prueba_evaluativa.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class LessonBasicResp {
    
    private Long id;
    private String title;
    private String content;
    private Boolean active;
}
