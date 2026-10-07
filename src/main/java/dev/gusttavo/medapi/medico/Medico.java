package dev.gusttavo.medapi.medico;

import dev.gusttavo.medapi.controller.DadosAtualizacaoMedico;
import dev.gusttavo.medapi.endereco.DadosEndereco;
import dev.gusttavo.medapi.endereco.Endereco;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

@Entity
@Table(name = "medico")
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Medico {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    private String telefone;

    private String crm;
    @Enumerated(value = EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInformacoes(@Valid DadosAtualizacaoMedico dadosAtualizacaoMedico) {
        if(dadosAtualizacaoMedico.nome() != null){
            this.nome = dadosAtualizacaoMedico.nome();
        }

        if(dadosAtualizacaoMedico.telefone() != null){
            this.telefone = dadosAtualizacaoMedico.telefone();
        }

        if(dadosAtualizacaoMedico.endereco() != null){
            this.endereco.atualizarInformacoes(dadosAtualizacaoMedico.endereco());
        }
    }
}
