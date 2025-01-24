package aula07;

import java.util.Random;

public class Luta {
  //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado; 

    //metodos personalizados 
    public void marcarLuta(Lutador l1,Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1!=l2){
            aprovado = true;
            desafiado = l1;
            desafiante = l2;
        }else{
            aprovado = false;
            desafiado = null;
            desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovado){
            System.out.println("##DESAFIADO##");
            desafiado.apresentar();
            System.out.println("##DESAFIANTE##");
            desafiante.apresentar();
            
            Random aleatorio = new Random();
            
            int vencedor = aleatorio.nextInt(3); // 0 , 1 ou 2
            System.out.println("========RESULTADO DA LUTA=========");
            switch(vencedor){
               case 0:
                   System.out.println("EMPATE");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
               case 1:
                    System.out.println("VITORIA DE :" + desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
               case 2:
                    System.out.println("VITORIA DE: " + desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                
            }

        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }
    
    //metodos especiais 

    //public Luta(Lutador desafiado, Lutador desafiante, int rounds, boolean aprovado) {
    //    this.desafiado = desafiado;
    //    this.desafiante = desafiante;
    //    this.rounds = rounds;
    //    this.aprovado = aprovado;
    //}

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

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    
}
