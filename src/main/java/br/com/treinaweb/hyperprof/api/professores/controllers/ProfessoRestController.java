package br.com.treinaweb.hyperprof.api.professores.controllers;

import br.com.treinaweb.hyperprof.api.common.routes.ApiRoutes;
import br.com.treinaweb.hyperprof.api.professores.dtos.ProfessorResponse;
import br.com.treinaweb.hyperprof.api.professores.services.ProfesorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProfessoRestController {

    private final ProfesorService service;

    @GetMapping(ApiRoutes.BUSCAR_PROFESSORES)
    public List<ProfessorResponse> bucarProfessores(
            @RequestParam(name = "q", required = false, defaultValue = "") String descricao
    ) {
        return service.bucarProfessores(descricao);
    }

    @GetMapping(ApiRoutes.BUSCAR_PROFESSSOR_POR_ID)
    public ProfessorResponse buscarProfessorPorId(@PathVariable Long professorId) {
        return service.buscarProfessorPorId(professorId);
    }
}
