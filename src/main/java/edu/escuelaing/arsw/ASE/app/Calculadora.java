package edu.escuelaing.arsw.ASE.app;

/**
 * Class representing a basic calculator.
 */
public class Calculadora {
    private double resultado;

    /**
     * Constructor that initializes the result to 0.
     */
    public Calculadora() {
        this.resultado = 0;
    }

    /**
     * Gets the current result of the calculator.
     * @return The current result.
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * Sets the result of the calculator.
     * @param resultado The new result value.
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    /**
     * Adds a value to the current result.
     * @param valor The value to add.
     */
    public void sumar(double valor) {
        this.resultado += valor;
    }

    /**
     * Subtracts a value from the current result.
     * @param valor The value to subtract.
     */
    public void restar(double valor) {
        this.resultado -= valor;
    }

    /**
     * Multiplies the current result by a value.
     * @param valor The value to multiply by.
     */
    public void multiplicar(double valor) {
        this.resultado *= valor;
    }

    /**
     * Divides the current result by a value.
     * @param valor The value to divide by.
     * @throws ArithmeticException If the value is 0.
     */
    public void dividir(double valor) {
        if (valor != 0) {
            this.resultado /= valor;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    /**
     * Resets the result to 0.
     */
    public void clear() {
        this.resultado = 0;
    }
}
