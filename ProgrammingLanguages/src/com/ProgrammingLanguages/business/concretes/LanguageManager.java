package com.ProgrammingLanguages.business.concretes;

import com.ProgrammingLanguages.business.abstracts.LanguagesService;
import com.ProgrammingLanguages.dataAccess.abstracts.ProgrammingLanguagesRepository;
import com.ProgrammingLanguages.dataAccess.abstracts.concretes.InMemoryProgrammingLanguages;
import com.ProgrammingLanguages.entities.concretes.Languages;

import java.util.ArrayList;
import java.util.List;

public class LanguageManager implements LanguagesService, ProgrammingLanguagesRepository {
    List<Languages> languages;
    int k;
    private ProgrammingLanguagesRepository programmingLanguagesRepository;

    public LanguageManager(ProgrammingLanguagesRepository programmingLanguagesRepository){
        this.programmingLanguagesRepository=programmingLanguagesRepository;
    }

    @Override
    public List<Languages> getAll() {

        return programmingLanguagesRepository.getAll();
    }

    @Override
    public int getById(int id) throws Exception {

        return  programmingLanguagesRepository.getById(k);

    }


    @Override
    public void add(Languages languages)  {

        if (languages.getName().isEmpty()){
            System.out.println("İsim alanı boş geçilemez");
        }

        for (Languages l: programmingLanguagesRepository.getAll() ){
            if (l.getName().equals(languages.getName())){
                System.out.println("Programlama dilleri tekrar edemez");
            }
        }
    }

    @Override
    public void delete(Languages languages) {

        programmingLanguagesRepository.delete(languages);

    }

    @Override
    public void update(Languages languages) {
        programmingLanguagesRepository.update(languages);

    }


}
