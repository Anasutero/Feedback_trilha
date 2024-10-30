package br.ETS.feedback.instrutor.DTO;


import jakarta.validation.constraints.NotBlank;

public record DadosInformacoes(@NotBlank String disciplina,
                               @NotBlank String trilha,
                               @NotBlank String faculdade ,
                               @NotBlank String turma) {

}
