package com.ProgrammingLanguages.webApi;

import com.ProgrammingLanguages.business.abstracts.LanguagesService;
import com.ProgrammingLanguages.entities.concretes.Languages;

import java.util.List;

@RestController
@RequestMapping
public class LanguagesController {

    private LanguagesService languagesService;

    public LanguagesController(LanguagesService languagesService) {
        this.languagesService=languagesService;

    }
    @GetMapping
    public List<Languages> getAll(){
        return languagesService.getAll();
    }

    @PostMapping
    public  void add(Languages languages){
        languagesService.add(languages);
    }
    @DeleteMapping
    public void delete(Languages languages){
        languagesService.delete(languages);
    }
    @PostMapping
    public void update(Languages languages){
        languagesService.update(languages);
    }
}
