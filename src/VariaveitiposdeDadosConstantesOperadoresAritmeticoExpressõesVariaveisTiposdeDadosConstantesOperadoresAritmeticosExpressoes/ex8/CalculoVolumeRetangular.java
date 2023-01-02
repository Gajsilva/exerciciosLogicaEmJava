package VariaveitiposdeDadosConstantesOperadoresAritmeticoExpressõesVariaveisTiposdeDadosConstantesOperadoresAritmeticosExpressoes.ex8;

public class CalculoVolumeRetangular {
    private double comprimento;
    private double largura;
    private double altura;

    public CalculoVolumeRetangular(double comprimento, double largura, double altura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    private void volume(){
        double volume = comprimento * largura * altura;
        System.out.println("volume em cm3: "+volume*100);
    }

    public static void main(String[] args) {
        CalculoVolumeRetangular calculoVolumeRetangular = new CalculoVolumeRetangular(3, 3,1);
        calculoVolumeRetangular.volume();
    }
}
