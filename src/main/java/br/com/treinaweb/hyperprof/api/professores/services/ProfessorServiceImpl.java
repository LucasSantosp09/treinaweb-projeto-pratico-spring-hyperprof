package br.com.treinaweb.hyperprof.api.professores.services;

import br.com.treinaweb.hyperprof.api.professores.dtos.ProfessorResponse;
import br.com.treinaweb.hyperprof.api.professores.mappers.ProfessorMapper;
import br.com.treinaweb.hyperprof.core.exceptions.ProfessorNotFoundExpetion;
import br.com.treinaweb.hyperprof.core.repositories.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProfessorServiceImpl implements ProfesorService  {

    private final ProfessorRepository professorRepository;
    private final ProfessorMapper professorMapper;



    @Override
    public List<ProfessorResponse> bucarProfessores(String descricao) {
        return professorRepository.findByDescricaoContaining(descricao)
                .stream()
                .map(professorMapper::toProfessorResponse)
                .toList();
    }

    @Override
    public ProfessorResponse buscarProfessorPorId(Long professorId) {
        return professorRepository.findById(professorId)
                .map(professorMapper::toProfessorResponse)
                .orElseThrow(ProfessorNotFoundExpetion::new);
    }
}
