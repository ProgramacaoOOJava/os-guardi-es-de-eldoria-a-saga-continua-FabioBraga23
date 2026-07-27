package aventureiro;

// Classe que representa um personagem da classe Guerreiro.
public class Guerreiro extends Personagem {

    // Construtor
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
    }

    // Habilidade exclusiva do guerreiro
    @Override
    public void usarHabilidade() {

        System.out.println(getNome() + " desfere um golpe devastador!");
        System.out.println(">> A espada corta o ar com enorme força...");
        System.out.println(">> O inimigo recua diante do impacto!");
    }

}