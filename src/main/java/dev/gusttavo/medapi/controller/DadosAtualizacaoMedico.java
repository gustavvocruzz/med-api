package dev.gusttavo.medapi.controller;

import dev.gusttavo.medapi.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(Long id, String nome, String telefone, String email, DadosEndereco endereco) {
}
