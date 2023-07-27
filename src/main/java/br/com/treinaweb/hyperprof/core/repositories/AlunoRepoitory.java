package br.com.treinaweb.hyperprof.core.repositories;

import br.com.treinaweb.hyperprof.core.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepoitory extends JpaRepository<Aluno, Long> {
}
