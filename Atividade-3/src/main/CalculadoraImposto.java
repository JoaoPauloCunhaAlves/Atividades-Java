package main;
import classes.*;

public class CalculadoraImposto {
    public static void main(String[] args) {
        Imposto[] impostos = new Imposto[2];
        impostos[0] = new ImpostoPessoaJuridica(500000);
        impostos[1] = new ImpostoPessoaFisica(30000);

        for (Imposto imposto : impostos) {
            System.out.println("Imposto calculado: " + imposto.calcularImposto());
        }
    }
}