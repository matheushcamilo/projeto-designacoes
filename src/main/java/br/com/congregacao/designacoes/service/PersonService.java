package br.com.congregacao.designacoes.service;
import br.com.congregacao.designacoes.entities.Person;
import br.com.congregacao.designacoes.entities.Task;
import br.com.congregacao.designacoes.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public String createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return "Pessoa de id " + savedPerson.getId() + " criada!!";
    }

    public Set<String> listAllPeople(){
        List<Person> allPeople = personRepository.findAll();
        Set<String> nomesDasPessoas = new TreeSet<>();
        for (Person person : allPeople) {
            nomesDasPessoas.add(person.getNome());
        }
        return nomesDasPessoas;
    }
}
