package vet.med.api.endereco;

import jakarta.persistence.Embeddable;


@Embeddable
public class Endereco {
    private String logadouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

}
