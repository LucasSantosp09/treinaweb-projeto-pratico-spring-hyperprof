package br.com.treinaweb.hyperprof.api.professores.mappers;

import br.com.treinaweb.hyperprof.api.professores.dtos.ProfessorResponse;
import br.com.treinaweb.hyperprof.core.models.Professor;
import org.springframework.stereotype.Component;

@Component
public class ProfessorMapperImpl implements ProfessorMapper {

    @Override
    public ProfessorResponse toProfessorResponse(Professor professor) {
        if (professor == null){
          return null;
        }
        return ProfessorResponse.builder()
                .id(professor.getId())
                .nome(professor.getNome())
                .email(professor.getEmail())
                .idade(professor.getIdade())
                .descricao(professor.getDescricao())
                .valorHora(professor.getValorHora())
                .fotoPerfil(professor.getFotoPerfil())
                .createdAt(professor.getCreatedAt())
                .updatedAt(professor.getUpdatedAt())
                .build();

        /*
        Outra forma de fazer sem utilizar o builder

        var professorResponse = new ProfessorResponse();
        professorResponse.setId(professor.getId());
        professorResponse.setNome(professor.getNome());
        professorResponse.setEmail(professor.getEmail());
        professorResponse.setIdade(professor.getIdade());
        professorResponse.setDescricao(professor.getDescricao());
        professorResponse.setValorHora(professor.getValorHora());
        professorResponse.setFotoPerfil(professor.getFotoPerfil());
        professorResponse.setCreatedAt(professor.getCreatedAt());
        professorResponse.setUpdatedAt(professor.getUpdatedAt());

        return professorResponse;*/
    }
}
