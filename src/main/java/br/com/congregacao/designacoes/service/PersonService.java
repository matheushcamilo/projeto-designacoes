package br.com.congregacao.designacoes.service;
import br.com.congregacao.designacoes.entities.Person;
import br.com.congregacao.designacoes.entities.Task;
import br.com.congregacao.designacoes.repository.PersonRepository;
import br.com.congregacao.designacoes.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final TaskService taskService;
    @Autowired
    public PersonService(PersonRepository personRepository, TaskService taskService) {
        this.personRepository = personRepository;
        this.taskService = taskService;
    }

    public String createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return "Pessoa de id " + savedPerson.getId() + " criada!!";
    }

    //Todo Create verification to see if task has been assigned to another person
    public String assignTask(Long personId, Long taskId){
        Person person = personRepository.findById(personId).get();
        Task task = taskService.getTaskById(taskId).get();
        if(person.getTasks().contains(task)){
            return "Warning: This person has been assigned to this task before";
        }
        person.getTasks().add(task);
        personRepository.save(person);
        return "Person with id #" + personId + " has been updated!";
    }
    public List<Person> listAllPeople(){
        List<Person> allPeople = personRepository.findAll();
        return allPeople;
    }
}
