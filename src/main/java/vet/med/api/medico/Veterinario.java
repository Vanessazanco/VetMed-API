package vet.med.api.medico;

import jakarta.persistence.*;
import lombok.*;
import vet.med.api.endereco.Endereco;


@Table(name = "veterinarios")
@Entity(name = "Veterinario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Veterinario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crmv;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public Veterinario(DadosCadastroVeterianrio dados) {
    this.nome= dados.nome();
    this.email= dados.email();
    this.crmv= dados.crmv();
    this.especialidade= dados.especialidade();
    this.endereco= new Endereco(dados.endereco());
    }
}
