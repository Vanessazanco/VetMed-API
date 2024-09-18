package vet.med.api.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vet.med.api.medico.DadosCadastroVeterianrio;

@RestController
@RequestMapping("veterinarios")
public class VeterinarioController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroVeterianrio dados){

    }

}
