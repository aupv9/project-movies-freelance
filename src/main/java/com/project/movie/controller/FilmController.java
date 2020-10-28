package com.project.movie.controller;

import com.project.movie.document.Film;
import com.project.movie.document.User;
import com.project.movie.service.film.FilmServiceImp;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Log4j2
public class FilmController {

    @Autowired
    private FilmServiceImp filmServiceImp;

    @GetMapping(value = "/films")
    public ResponseEntity<?> findAllFilm(){
        log.info("findAllFilm info");
        List<Film> filmList = filmServiceImp.findAll();
        return  filmList != null ? new ResponseEntity<>(filmList, HttpStatus.OK):
                new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
}
