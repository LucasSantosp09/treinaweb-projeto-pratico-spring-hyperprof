package br.com.treinaweb.hyperprof.api.alunos.services;

import br.com.treinaweb.hyperprof.api.alunos.dtos.AlunoRequest;
import br.com.treinaweb.hyperprof.api.alunos.dtos.AlunoResponse;
import br.com.treinaweb.hyperprof.api.alunos.mappers.AlunoMapper;
import br.com.treinaweb.hyperprof.core.exceptions.ProfessorNotFoundExpetion;
import br.com.treinaweb.hyperprof.core.repositories.AlunoRepoitory;
import br.com.treinaweb.hyperprof.core.repositories.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlunoServiceImpl implements AlunoService {

    private final AlunoMapper alunoMapper;
    private final AlunoRepoitory alunoRepository;
    private final ProfessorRepository professorRepository;

    @Override
    public AlunoResponse cadastrarAluno(AlunoRequest alunoRequest, Long professorId) {
        var professor = professorRepository.findById(professorId)
                .orElseThrow(ProfessorNotFoundExpetion::new);
        var alunoParaCadastrar = alunoMapper.toAluno(alunoRequest);
        alunoParaCadastrar.setProfessor(professor);
        var alunoCadastrado = alunoRepository.save(alunoParaCadastrar);
        return alunoMapper.toAlunoResponse(alunoCadastrado);
    }

}


