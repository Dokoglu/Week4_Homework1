package com.ProgrammingLanguages.business.abstracts;

import com.ProgrammingLanguages.entities.concretes.Languages;

import java.util.List;

public interface LanguagesService {
    List<Languages> getAll();

   int getById(int id) throws Exception;

   void add(Languages languages) ;
   void delete(Languages languages);

   void update(Languages languages);
}
