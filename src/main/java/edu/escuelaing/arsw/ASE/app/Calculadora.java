package edu.escuelaing.arsw.ASE.app;

public class Calculadora {
    private double resultado;

    public Calculadora() {
        this.resultado = 0;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void sumar(double valor) {
        this.resultado += valor;
    }

    public void restar(double valor) {
        this.resultado -= valor;
    }

    public void multiplicar(double valor) {
        this.resultado *= valor;
    }

    public void dividir(double valor) {
        if (valor != 0) {
            this.resultado /= valor;
        } else {
            throw new ArithmeticException("No se puede dividir por cero");
        }
    }

    public void clear() {
        this.resultado = 0;
    }
}
