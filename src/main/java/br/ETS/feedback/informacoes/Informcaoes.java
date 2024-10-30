package br.ETS.feedback.informacoes;

import br.ETS.feedback.instrutor.DTO.DadosCadastroInstrutor;
import br.ETS.feedback.instrutor.DTO.DadosInformacoes;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.*;

@Getter // get para todos os atributos
@Setter // set para todos os atributos
@AllArgsConstructor  // contrtuor para todos os atributos
@NoArgsConstructor// faz o constrtuor padrão sem atributo
@EqualsAndHashCode// faz o metodo  equals e metodos hascode
@Embeddable

public class Informcaoes {
    private String disciplina;
    private String trilha;
    private String faculdade;
    private String turma;

    public Informcaoes(DadosInformacoes dadosInformacoes){
        this.disciplina = dadosInformacoes.disciplina();
        this.trilha = dadosInformacoes.trilha();
        this.faculdade = dadosInformacoes.faculdade();
        this.turma = dadosInformacoes.turma();
    }


}
