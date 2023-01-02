package ex5;

public class VolumeLata {
    double pi = 3.141592654;
    public double volume(double raio, double altura){
        double cm = (pi*(raio * raio)) * altura;
        return cm * 100 ;
    }
    public static void main(String[] args) {
        VolumeLata volumeLata = new VolumeLata();
        System.out.println("Volume em cm: "+volumeLata.volume(2, 2));
    }
}
