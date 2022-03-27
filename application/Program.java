package application;

import entities.Retangulo;
import entities.RetanguloTest;

public class Program {
    public static void main(String[] args) {
        RetanguloTest teste = new RetanguloTest();
        boolean resultado;

        resultado = teste.testCalcularArea();
        System.out.println("testCalcularArea(): " + resultado);

        resultado = teste.testCalcularPerimetro();
        System.out.println("testCalcularPerimetro(): " + resultado);
    }
}
