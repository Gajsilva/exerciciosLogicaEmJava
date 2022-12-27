package ex1;

public class Raio {
    static double pi = 3.141592654;

    private static double areaCirculo(double raio) {
        double elevado = raio * raio;
        return pi * elevado;
    }

    public static void main(String[] args) {
        System.out.println("Valor da area do circulo é "+areaCirculo(3) );
    }

}

