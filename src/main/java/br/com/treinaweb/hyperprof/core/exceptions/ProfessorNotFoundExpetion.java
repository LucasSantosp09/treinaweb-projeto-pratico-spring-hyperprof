package br.com.treinaweb.hyperprof.core.exceptions;

public class ProfessorNotFoundExpetion extends ModelNotFoundException {

    public ProfessorNotFoundExpetion(){
        super("Professor não encontrado");
    }

    public ProfessorNotFoundExpetion(String message) {
        super(message);
    }
}
