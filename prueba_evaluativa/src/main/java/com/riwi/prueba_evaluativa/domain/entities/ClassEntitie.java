package com.riwi.prueba_evaluativa.domain.entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "class")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClassEntitie {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (length = 100, nullable = false)
    private String name;
    @Lob
    private String description;
    private LocalDateTime created;
    private Boolean active;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude  
    @OneToMany (
        fetch = FetchType.EAGER,
        mappedBy = "class",
        cascade = CascadeType.ALL, 
        orphanRemoval = false
    )
    private List<LessonEntitie> lessoneEntities;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "classEntitie",
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<StudentEntitie> studentEntities;
}