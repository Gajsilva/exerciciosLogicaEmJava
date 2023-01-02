package ex3;

public class CalculoSalario {
    public double salarioBase;
    public double totalDesconto;

    public double  calculoSalarioBase (double horasTrabalhadas, double valorHoraTrabalhada){
       return salarioBase = horasTrabalhadas * valorHoraTrabalhada;
    }

    public double calculoTotalDesconto(double percentualDesconto){
        return totalDesconto = salarioBase * (percentualDesconto/100);
    }

    public double calculoSalarioLiquido (){
       return salarioBase - totalDesconto;
    }

    public static void main(String[] args) {
        CalculoSalario calculoSalario = new CalculoSalario();

        System.out.println("Calculo de salario bruto: "+calculoSalario.calculoSalarioBase(240,15.3));
        System.out.println("Total descontado do salario: "+calculoSalario.calculoTotalDesconto(20));
        System.out.println("Calculo de salario liquido: "+calculoSalario.calculoSalarioLiquido());
    }
}
