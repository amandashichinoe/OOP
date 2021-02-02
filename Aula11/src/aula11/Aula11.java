package aula11;

public class Aula11 {

    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); --> Pessoa é abstract e não pode ser instanciada
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        
        v1.setNome("João");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        a1.setNome("Juliana");
        a1.setIdade(15);
        a1.setSexo("F");
        a1.setMatricula(123456);
        a1.setCurso("Informática");
        System.out.println(a1.toString());
        
        a1.PagarMensalidade();
        
        b1.setMatricula(123548);
        b1.setNome("Jubileu");
        b1.PagarMensalidade();
       
        
        
    }
    
}
