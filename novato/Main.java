package novato;

import java.util.ArrayList;

/*
 * Classe principal do sistema.
 * Cria os personagens e demonstra o polimorfismo.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== BEM-VINDOS AO REINO DE ELDORIA ===");
        System.out.println("Os Guardiões se preparam para a batalha!\n");

        // Criando uma lista de personagens
        ArrayList<Personagem> personagens = new ArrayList<>();

        // Adicionando Magos à lista
        personagens.add(new Mago("Eldoran", "Mago", 7, 60, 18.0));
        personagens.add(new Mago("Merlin", "Mago", 9, 55, 22.5));

        // Adicionando Guerreiros à lista
        personagens.add(new Guerreiro("Arthas", "Guerreiro", 8, 120, 20.0));
        personagens.add(new Guerreiro("Leon", "Guerreiro", 6, 110, 16.5));

        // Percorrendo a lista
        for (Personagem personagem : personagens) {

            personagem.exibirStatus();
            personagem.usarHabilidade();

            System.out.println("-------------------------------");
        }
    }
}