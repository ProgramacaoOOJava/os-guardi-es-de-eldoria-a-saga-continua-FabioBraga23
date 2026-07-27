package aventureiro;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== REINO DE ELDORIA - SISTEMA DE PERSONAGENS ===");
        System.out.println("Demonstração de POO Avançada: Herança, Encapsulamento e Polimorfismo\n");

        // Lista de personagens
        ArrayList<Personagem> personagens = new ArrayList<>();

        // Magos
        personagens.add(new Mago("Eldoran", 7, 60, 18.0));
        personagens.add(new Mago("Lyralei", 9, 55, 22.5));

        // Guerreiros
        personagens.add(new Guerreiro("Arthemis", 5, 80, 12.5));
        personagens.add(new Guerreiro("Ragnar", 8, 110, 17.8));

        // Curandeiros
        personagens.add(new Curandeiro("Serena", 6, 75, 15.0));
        personagens.add(new Curandeiro("Aelar", 8, 82, 19.5));

        System.out.println("Personagens criados com sucesso!\n");

        // Exibe informações dos personagens
        for (Personagem personagem : personagens) {

            System.out.println("--------------------------------------------");
            System.out.println(">> Status do Personagem:");
            System.out.println(personagem);

            System.out.println("\n>> Usando Habilidade:");
            personagem.usarHabilidade();

            System.out.println("\n>> Verificação de Tipo:");

            if (personagem instanceof Mago) {

                System.out.println("O personagem "
                        + personagem.getNome()
                        + " é um Mago de nível "
                        + personagem.getNivel() + ".");

                System.out.println("Especialista em magias e feitiços arcanos.");

            } else if (personagem instanceof Guerreiro) {

                System.out.println("O personagem "
                        + personagem.getNome()
                        + " é um Guerreiro de nível "
                        + personagem.getNivel() + ".");

                System.out.println("Especialista em combate corpo a corpo.");

            } else if (personagem instanceof Curandeiro) {

                System.out.println("O personagem "
                        + personagem.getNome()
                        + " é um Curandeiro de nível "
                        + personagem.getNivel() + ".");

                System.out.println("Especialista em cura e suporte aos aliados.");
            }

            System.out.println();
        }

        // ==========================================
        // Testes do equals()
        // ==========================================

        System.out.println("=============================================");
        System.out.println("=== TESTES DE COMPARAÇÃO (equals) ===");
        System.out.println("=============================================\n");

        Personagem pers1 = new Mago("Gandalf", 10, 100, 25.0);
        Personagem pers2 = new Mago("Gandalf", 4, 50, 10.0);
        Personagem pers3 = new Guerreiro("Gandalf", 10, 120, 30.0);
        Personagem pers4 = new Mago("Merlin", 8, 90, 20.0);

        System.out.println("Personagens para teste:");
        System.out.println("1. Gandalf (Mago)");
        System.out.println("2. Gandalf (Mago)");
        System.out.println("3. Gandalf (Guerreiro)");
        System.out.println("4. Merlin (Mago)\n");

        System.out.println(">> Comparações usando equals():\n");

        System.out.println("pers1.equals(pers2): " + pers1.equals(pers2));
        System.out.println("pers1.equals(pers3): " + pers1.equals(pers3));
        System.out.println("pers1.equals(pers4): " + pers1.equals(pers4));
        System.out.println("pers2.equals(pers4): " + pers2.equals(pers4));

        // ==========================================
        // Testes do hashCode()
        // ==========================================

        System.out.println("\n=============================================");
        System.out.println("=== TESTES DE HASHCODE ===");
        System.out.println("=============================================\n");

        System.out.println("HashCode pers1: " + pers1.hashCode());
        System.out.println("HashCode pers2: " + pers2.hashCode());
        System.out.println("HashCode pers3: " + pers3.hashCode());
        System.out.println("HashCode pers4: " + pers4.hashCode());

        // ==========================================
        // Comparação simples
        // ==========================================

        System.out.println("\n=============================================");
        System.out.println("=== COMPARAÇÃO ENTRE PERSONAGENS ===");
        System.out.println("=============================================\n");

        Personagem personagemA = personagens.get(0);
        Personagem personagemB = personagens.get(2);

        if (personagemA.equals(personagemB)) {

            System.out.println("Comparando, "
                    + personagemA.getNome()
                    + " e "
                    + personagemB.getNome()
                    + " são iguais.");

        } else {

            System.out.println("Comparando, "
                    + personagemA.getNome()
                    + " e "
                    + personagemB.getNome()
                    + " são diferentes.");
        }

        System.out.println("\n=== FIM DO SISTEMA DE PERSONAGENS ===");

    }

}