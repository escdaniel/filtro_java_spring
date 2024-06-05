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
public class ClassResp {
    
    private Long id;
    private String name;
    private String description;
    private Boolean active;
    private List<LessonBasicResp> lesson;
    private List<StudentBasicResp> student;
}

