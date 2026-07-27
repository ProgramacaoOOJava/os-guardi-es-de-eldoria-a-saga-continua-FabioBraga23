package novato;

/*
 * Classe que representa um Guerreiro.
 * Herda as características da classe Personagem.
 */
public class Guerreiro extends Personagem {

    // Construtor da classe Guerreiro
    public Guerreiro(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        super(nome, classe, nivel, pontosDeVida, poderBase);
    }

    // Habilidade específica do Guerreiro
    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome()
                + " desfere um poderoso golpe de espada!");
    }
}