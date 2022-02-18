package br.com.congregacao.designacoes.service;


import br.com.congregacao.designacoes.entities.Person;
import br.com.congregacao.designacoes.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<Person> listAll(){
        List<Person> allPeople = personRepository.findAll();
        return allPeople;
    }


    public Person getPersonByNome(String nome) {
        return personRepository.findByNome(nome);
    }
}
