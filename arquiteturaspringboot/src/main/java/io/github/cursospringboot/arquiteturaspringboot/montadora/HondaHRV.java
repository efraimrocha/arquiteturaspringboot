package io.github.cursospringboot.arquiteturaspringboot.montadora;

import java.awt.*;

public class HondaHRV extends Carro {

    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRV");
        setCor(Color.ORANGE);
        setMontadora(Montadora.HONDA);
    }
}
