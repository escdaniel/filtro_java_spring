package com.riwi.prueba_evaluativa.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MultimediaBasiResp {
    private Long id;
    private String type;
    private String url;
    private Boolean active;
}
