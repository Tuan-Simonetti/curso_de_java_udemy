package poo.composicao.composicaoRelacao1para1;

public class Carro {

    Motor motor;

    Carro() {
        this.motor = new Motor(this);
    }

//    Motor motor = new Motor();
    void acelerar() {
        motor.fatorInjecao += 0.4;
    }

    void frear() {
        if (motor.fatorInjecao < 2.6) {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }
}
