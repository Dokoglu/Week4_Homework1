package com.ProgrammingLanguages.dataAccess.abstracts;

import com.ProgrammingLanguages.entities.concretes.Languages;

import java.util.List;

public interface ProgrammingLanguagesRepository {
    List<Languages> getAll();

    

    void add(Languages languages);

    void delete(Languages languages);

    void update(Languages languages);

    int  getById(int id) throws Exception;
}
