package ex7;

public class PrestacaoAtrasada {
    public double parcelaAtrasada(double valorParcela, double taxa, double tempoEmAtraso){
        return valorParcela +(valorParcela *(taxa / 100) * tempoEmAtraso) ;
    }
    public static void main(String[] args) {
        PrestacaoAtrasada prestacaoAtrasada = new PrestacaoAtrasada();
        double prestacaoEmAtrasada = prestacaoAtrasada.parcelaAtrasada(900, 8.55, 12);
        System.out.println("Valor em atraso: "+prestacaoEmAtrasada);
    }
}
