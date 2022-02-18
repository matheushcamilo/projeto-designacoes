package br.com.congregacao.designacoes.controller;


import br.com.congregacao.designacoes.entities.Person;
import br.com.congregacao.designacoes.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }

    @GetMapping("/people")
    public List<Person> listAll(){
        return personService.listAll();
    }

    @GetMapping("/person/{nome}")
    public Person getPersonByNome(@PathVariable String nome){
        return personService.getPersonByNome(nome);
    }


}
