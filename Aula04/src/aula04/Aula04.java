package aula04;

public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", 0.5f, "Azul");
        Caneta c2 = new Caneta("NIC", 0.4f, "Amarela");
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        System.out.println("Também tenho uma caneta " + c2.getModelo() + " de ponta " + c2.getPonta());
    }
    
}
