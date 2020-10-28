package com.project.movie.service.film;

import com.project.movie.dao.FilmRepository;
import com.project.movie.document.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImp implements FilmService{

    @Autowired
    private FilmRepository filmRepository;

    @Override
    public List<Film> findAll() {
        return filmRepository.findAll();
    }
}
