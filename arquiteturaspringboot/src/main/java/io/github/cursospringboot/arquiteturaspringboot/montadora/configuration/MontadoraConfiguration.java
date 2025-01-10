package io.github.cursospringboot.arquiteturaspringboot.montadora.configuration;

import io.github.cursospringboot.arquiteturaspringboot.montadora.Motor;
import io.github.cursospringboot.arquiteturaspringboot.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    @Primary
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setModelo("XXX");
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindros(3);
        motor.setLitragem(1.4);
        motor.setModelo("XXX");
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindros(4);
        motor.setLitragem(1.5);
        motor.setModelo("XXX");
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }




}
