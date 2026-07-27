package aventureiro;

// Classe que representa um personagem da classe Mago.
public class Mago extends Personagem {

    // Construtor
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
    }

    // Habilidade exclusiva do mago
    @Override
    public void usarHabilidade() {

        System.out.println(getNome() + " conjura um feitiço de proteção!");
        System.out.println(">> Energia mágica flui através do cajado...");
        System.out.println(">> Uma barreira mágica se forma ao redor do grupo!");
    }

}