package com.riwi.prueba_evaluativa.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class MultimediaReq {
    
    private String url;
    private Long lesson_id;
    private Boolean active;
}
