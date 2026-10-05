package dev.gusttavo.medapi.controller;

import dev.gusttavo.medapi.dtos.DadosCadastroMedico;
import dev.gusttavo.medapi.dtos.DadosEndereco;
import dev.gusttavo.medapi.endereco.Endereco;
import dev.gusttavo.medapi.medico.Medico;
import dev.gusttavo.medapi.repository.MedicoRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private final MedicoRepository medicoRepository;

    public MedicoController(MedicoRepository medicoRepository){
        this.medicoRepository=medicoRepository;
    }


    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
        medicoRepository.save(new Medico(dados));
    }


}
