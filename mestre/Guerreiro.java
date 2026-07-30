package mestre;

// Classe que representa um personagem da classe Guerreiro.
public class Guerreiro extends Personagem {

    // Construtor
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
    }

    // Habilidade exclusiva do guerreiro
    @Override
    public void usarHabilidade() {

        System.out.println("Habilidade: " + getNome() + " executa um golpe devastador!");
    }

}