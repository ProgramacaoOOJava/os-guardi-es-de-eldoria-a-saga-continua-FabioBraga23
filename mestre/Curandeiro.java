package mestre;

// Classe que representa um personagem da classe Curandeiro.
public class Curandeiro extends Personagem {

    // Construtor
    public Curandeiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Curandeiro", nivel, pontosDeVida, poderBase);
    }

    // Habilidade exclusiva do curandeiro
    @Override
    public void usarHabilidade() {

        System.out.println("Habilidade: " + getNome() + " canaliza uma poderosa magia de cura!");
    }

}