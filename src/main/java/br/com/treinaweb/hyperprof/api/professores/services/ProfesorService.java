package br.com.treinaweb.hyperprof.api.professores.services;

import br.com.treinaweb.hyperprof.api.professores.dtos.ProfessorResponse;


import java.util.List;

public interface ProfesorService {

    List<ProfessorResponse> bucarProfessores (String descricao);

    ProfessorResponse buscarProfessorPorId(Long professorId );
}
