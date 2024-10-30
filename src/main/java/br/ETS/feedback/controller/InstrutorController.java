package br.ETS.feedback.controller;

import br.ETS.feedback.instrutor.DTO.DadosCadastroInstrutor;
import br.ETS.feedback.instrutor.Instrutor;
import br.ETS.feedback.instrutor.InstrutorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/instrutor")
public class InstrutorController {

    @Autowired
    private InstrutorRepository repository;

    @PostMapping
    public void Cadastrar(@RequestBody @Valid DadosCadastroInstrutor dadosCadastroInstrutor){
       repository.save(new Instrutor(dadosCadastroInstrutor));

    }
}
