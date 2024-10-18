package classes;

public class Divisao  extends Operacao{
    public double num1;
    public double num2;

    public Divisao(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public double calcular(double num1, double num2) {
        return num1 / num2;
    }
}