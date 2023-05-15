package com.finalproject.allyoucanbuyproject.service;

import com.finalproject.allyoucanbuyproject.model.AuthorModel;
import com.finalproject.allyoucanbuyproject.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public AuthorModel addAuthor(AuthorModel authorModel) {
        return authorRepository.save(authorModel);
    }

    public List<AuthorModel> getAuthors() {
        return authorRepository.findAll();
    }

    public Optional<AuthorModel> getAuthorById(Long id) {
        return authorRepository.findById(id);
    }
}