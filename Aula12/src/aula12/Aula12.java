package aula12;

public class Aula12 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        GoldFish goldFish = new GoldFish();
        Arara arara = new Arara();
        
        canguru.locomover();
        cachorro.locomover();
        
        canguru.emitirSom();
        cachorro.emitirSom();
        
        cobra.locomover();
        tartaruga.locomover();
        
        /*a.setCorPena("Azul");
        System.out.println(a);
        
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        a.locomover();
        a.emitirSom();
        
        p.locomover();*/
    }
    
}
