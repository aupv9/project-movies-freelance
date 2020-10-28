package com.project.movie.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {

    private String name;
    private String status;
    private String director;
    private String type;
    private String types;

}
