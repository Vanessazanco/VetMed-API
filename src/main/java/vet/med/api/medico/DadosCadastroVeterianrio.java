package vet.med.api.medico;

import vet.med.api.endereco.DadosEndereco;

public record DadosCadastroVeterianrio(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        DadosEndereco endereco) {
}
