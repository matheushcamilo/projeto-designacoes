package br.com.congregacao.designacoes.controller;

import br.com.congregacao.designacoes.entities.Person;
import br.com.congregacao.designacoes.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public String createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }

    @GetMapping()
    public List<Person> listAllPeople(){
        return personService.listAllPeople();
    }

    @PatchMapping("/{personId}/{taskId}")
    public String assignTaskToPerson(@PathVariable Long personId, @PathVariable  Long taskId){
        return personService.assignTask(personId, taskId);
    }
}
