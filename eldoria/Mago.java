package eldoria;

/*
 * Classe que representa um Mago.
 * Herda as características da classe Personagem.
 */
public class Mago extends Personagem {

    // Construtor da classe Mago
    public Mago(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        super(nome, classe, nivel, pontosDeVida, poderBase);
    }

    // Habilidade específica do Mago
    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome()
                + " conjura uma poderosa bola de fogo!");
    }
}