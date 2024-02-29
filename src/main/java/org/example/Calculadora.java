package org.example;

public class Calculadora {


    private static final double PI = 3.14159265358979;

    private static final double E = 2.718281828459;


    public Calculadora() {
    }


    public double sumar(double a, double b){
        return a + b;
    }



    public double restar(double a, double b){
        return a - b;
    }


    public double multiplicar(double a, double b){
        return a * b;
    }


    public double dividir(double a, double b){
        if (b != 0){
            return a / b;
        } else {
            throw new ArithmeticException("Intento de división entre cero.");
        }
    }

    public double potencia(double base, double exponente){
        return Math.pow(base, exponente);
    }


    public double valorAbsoluto(double valor){
        return Math.abs(valor);
    }
}



