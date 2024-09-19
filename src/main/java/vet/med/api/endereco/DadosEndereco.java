package vet.med.api.endereco;

public record DadosEndereco(
        String logadouro,
        String bairro,
        String cep,
        String cidade,
        String uf,
        String numero
) {
}
 