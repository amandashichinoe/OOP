package aula11;

public class Bolsista extends Aluno{
    private int bolsa;
    
    public void RenovarBolsa(){
        System.out.println("A bolsa de " + this.nome + " foi renovada.");
    }

    @Override
    public void PagarMensalidade() {
        System.out.println(this.nome + " é bolsista.");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
}
