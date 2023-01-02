package ex3;

public class CalculoSalario {
    public int salarioLiquido;
    public int salarioBase;
    public double totalDesconto;

    public int  calculoSalarioBase (int horasTrabalhadas, int valorHoraTrabalhada){
       return salarioBase = horasTrabalhadas * valorHoraTrabalhada;
    }

    public int calculoTotalDesconto(double percentualDesconto){
        return (int) (totalDesconto = salarioBase * (percentualDesconto/100));
    }

    public int calculoSalarioLiquido (){
       return (int) (salarioBase - totalDesconto);
    }

    public static void main(String[] args) {
        CalculoSalario calculoSalario = new CalculoSalario();

        System.out.println("Calculo de salario bruto: "+calculoSalario.calculoSalarioBase(240,10));
        System.out.println("Total descontado do salario: "+calculoSalario.calculoTotalDesconto(20));
        System.out.println("Calculo de salario liquido: "+calculoSalario.calculoSalarioLiquido());
    }
}
