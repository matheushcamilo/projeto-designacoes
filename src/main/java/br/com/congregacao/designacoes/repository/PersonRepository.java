package br.com.congregacao.designacoes.repository;

import br.com.congregacao.designacoes.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByNome(String nome);
}
