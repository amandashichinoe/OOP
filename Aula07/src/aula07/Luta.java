package aula07;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
   
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
   
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
           this.aprovada = true;
           this.desafiado = l1;
           this.desafiante = l2;
        }else{
           this.aprovada = false;
           this.desafiado = null;
           this.desafiante = null;
        }
    }
   
    public void lutar(){
        if(this.aprovada){
            System.out.println("### Desafiado ###");
            this.desafiado.apresentar();
            System.out.println("### Desafiante ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            rounds = aleatorio.nextInt(3) + 1;
            System.out.println("Número de Rounds: " + rounds);
            for(int i = 0; i<=rounds; i++){
                
            int vencedor = aleatorio.nextInt(3);
            System.out.println("======== RESULTADO DA LUTA =========");
            switch(vencedor){
                case 0:
                    System.out.println("Empate");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado.getName() + " venceu!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(this.desafiante.getName() + " venceu!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                default:
                    System.out.println("[ERRO]");
                        break;
            }
            System.out.println("====================================");
            }
        }else{
            System.out.println("A luta não pode acontecer.");
        }
    }
   
}
