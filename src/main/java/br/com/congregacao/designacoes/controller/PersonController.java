package br.com.congregacao.designacoes.controller;


import br.com.congregacao.designacoes.entities.Person;
import br.com.congregacao.designacoes.entities.Task;
import br.com.congregacao.designacoes.service.PersonService;
import br.com.congregacao.designacoes.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonService personService;
    private TaskService taskService;

    @Autowired
    public PersonController(PersonService personService, TaskService taskService) {
        this.taskService = taskService;
        this.personService = personService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public String createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }

    @GetMapping()
    public Set<String> listAllPeople(){
        return personService.listAllPeople();
    }
}
