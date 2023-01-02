package ex5;

public class ConsumoCombustivel {
    private final double consumoPorKm = 12;

    public double totalLitrosViagem(double horasGastaViagem, double velocidadeKmH){
        double distancia = horasGastaViagem * velocidadeKmH;
        return distancia / 12;
    }

    public static void main(String[] args) {
        ConsumoCombustivel consumoCombustivelLitros = new ConsumoCombustivel();
        int litrosViagem = (int) consumoCombustivelLitros.totalLitrosViagem(10, 80);
        System.out.println("Consumo de litros na viagem: "+litrosViagem);
    }
}
