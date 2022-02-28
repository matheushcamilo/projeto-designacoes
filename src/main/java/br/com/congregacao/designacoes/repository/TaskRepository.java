package br.com.congregacao.designacoes.repository;

import br.com.congregacao.designacoes.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
