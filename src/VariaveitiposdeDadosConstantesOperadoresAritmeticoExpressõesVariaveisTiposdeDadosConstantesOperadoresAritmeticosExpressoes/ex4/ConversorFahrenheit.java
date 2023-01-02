package VariaveitiposdeDadosConstantesOperadoresAritmeticoExpressõesVariaveisTiposdeDadosConstantesOperadoresAritmeticosExpressoes.ex4;

public class ConversorFahrenheit {
    public float calculoFahrenheit(float celsius ){
        return (9 * celsius) / 5;
    }
    public float calculoCelsius(float fahrenheit){
        return ((fahrenheit - 32) * 5) / 9;
    }
    public static void main(String[] args) {
        ConversorFahrenheit conversorFahrenheit = new ConversorFahrenheit();
        System.out.println(conversorFahrenheit.calculoCelsius(80));
        System.out.println(conversorFahrenheit.calculoFahrenheit(40));
    }
}
