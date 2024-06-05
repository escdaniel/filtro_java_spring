package com.riwi.prueba_evaluativa.api.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LessonResp {
    
    private Long id;
    private String title;
    private String content;
    private Boolean active;
    private List<MultimediaBasiResp> multimedia;
    private ClassBasicResp classEntitie;
}
