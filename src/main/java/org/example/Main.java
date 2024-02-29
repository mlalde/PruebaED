package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la calculadora
        Calculadora calculadora = new Calculadora();

        // Realizar algunas operaciones matemáticas
        double resultadoSuma = calculadora.sumar(5, 3);
        double resultadoResta = calculadora.restar(5, 3);
        double resultadoMultiplicacion = calculadora.multiplicar(5, 3);
        double resultadoDivision = calculadora.dividir(6, 2);
        double resultadoPotencia = calculadora.potencia(2, 3);
        double resultadoAbsoluto = calculadora.valorAbsoluto(-10);
        
        // Imprimir los resultados
        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la resta: " + resultadoResta);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
        System.out.println("Resultado de la división: " + resultadoDivision);
        System.out.println("Resultado de la potencia: " + resultadoPotencia);
        System.out.println("Valor absoluto: " + resultadoAbsoluto);
    }
}