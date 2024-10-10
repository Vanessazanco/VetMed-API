package vet.med.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vet.med.api.endereco.Endereco;
import vet.med.api.medico.DadosCadastroVeterianrio;
import vet.med.api.medico.Veterinario;
import vet.med.api.medico.VeterinarioRepository;

@RestController
@RequestMapping("veterinarios")
public class VeterinarioController {

    @Autowired
    private VeterinarioRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroVeterianrio dados){
        repository.save(new Veterinario(dados));
    }

}
