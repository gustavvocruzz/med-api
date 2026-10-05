package dev.gusttavo.medapi.dtos;

import dev.gusttavo.medapi.endereco.DadosEndereco;
import dev.gusttavo.medapi.enums.Especialidade;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
