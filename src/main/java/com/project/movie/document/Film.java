package com.project.movie.document;

import com.project.movie.enums.TypeFilm;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {

    private String name;
    private String status;
    private String director;
    @Enumerated(EnumType.STRING)
    private TypeFilm type;
    @Enumerated(EnumType.STRING)
    private TypeFilm types;

}
