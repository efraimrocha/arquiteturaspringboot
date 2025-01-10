package io.github.cursospringboot.arquiteturaspringboot.montadora.api;

import io.github.cursospringboot.arquiteturaspringboot.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricanteController {

    @Autowired
    @Eletrico
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCArro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);

    }


}
