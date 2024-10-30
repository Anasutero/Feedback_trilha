package br.ETS.feedback.instrutor;

import br.ETS.feedback.informacoes.Informcaoes;
import br.ETS.feedback.instrutor.DTO.DadosCadastroInstrutor;
import jakarta.persistence.*;
import lombok.*;


@Getter //faz coom que todos os atributos da classe tenham um get
@Setter // faz com que todos tenham um set
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name="Instrutor")
@Table(name="tbinstrutores")
public class Instrutor{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;


    private String nome;
    private String email;
    private String edv;

    @Enumerated(EnumType.STRING)
    private Curso curso;

    @Embedded //conecta uma tabela a outra
    private Informcaoes  informacoes;

    private Boolean ferias;

    public Instrutor(DadosCadastroInstrutor dadosCadastroInstrutor){
        this.nome = dadosCadastroInstrutor.nome();
        this.email = dadosCadastroInstrutor.email();
        this.edv = dadosCadastroInstrutor.edv();
        this.curso = dadosCadastroInstrutor.curso();

        this.informacoes = new Informcaoes(dadosCadastroInstrutor.informacoes());

        this.ferias = dadosCadastroInstrutor.ferias();


    }
}

