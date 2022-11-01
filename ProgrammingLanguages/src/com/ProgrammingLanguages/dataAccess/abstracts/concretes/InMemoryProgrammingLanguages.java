package com.ProgrammingLanguages.dataAccess.abstracts.concretes;

import com.ProgrammingLanguages.dataAccess.abstracts.ProgrammingLanguagesRepository;
import com.ProgrammingLanguages.entities.concretes.Languages;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProgrammingLanguages implements ProgrammingLanguagesRepository {

    List<Languages> languages;

    public InMemoryProgrammingLanguages() {
        languages = new ArrayList<Languages>();
        languages.add((new Languages(1, "Python")));
        languages.add(new Languages(2, "C#"));
        languages.add(new Languages(3, "C ++"));


    }

    @Override
    public List<Languages> getAll() {
        return languages;
    }

    @Override
    public void add(Languages languages) {
        System.out.println("Programlama dili belleğe eklendi" + languages);
    }

    @Override
    public void delete(Languages languages) {

        System.out.println("Programlama dili bellekten silindi" + languages);
    }

    @Override
    public void update(Languages languages) {
        System.out.println("Programlama dili güncellendi" +
                "" + languages);
    }

    @Override
    public int getById(int id) {
        return 0;
    }

}
