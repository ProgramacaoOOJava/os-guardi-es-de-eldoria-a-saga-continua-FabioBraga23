package mestre;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== REINO DE ELDORIA ===\n");

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

        // Percorre todos os personagens
        for (Personagem personagem : personagens) {

            System.out.println("----------------------------------");

            personagem.exibirStatus();

            personagem.usarHabilidade();

            // Apenas os Magos implementam Auditavel
            if (personagem instanceof Mago) {

                Auditavel auditor = (Auditavel) personagem;

                auditor.registrarAcao("Conjurou bola de fogo");

                auditor.auditarAcoes();
            }

            // Casting explícito para Personagem
            Personagem p = (Personagem) personagem;

            p.atribuirBencao(2.0);

            System.out.println("Novo poder base após bênção: "
                    + String.format("%.1f", p.getPoderBase()));

            System.out.println();
        }

        // ==============================================
        // Demonstração adicional de casting e interfaces
        // ==============================================

        System.out.println("\n=== DEMONSTRAÇÃO AVANÇADA DE CASTING E INTERFACES ===\n");

        // Encontrando todos os magos na lista
        System.out.println(">> Processando apenas os Magos:");

        for (Personagem personagem : personagens) {

            if (personagem instanceof Mago) {

                // Casting explícito para Mago
                Mago mago = (Mago) personagem;

                System.out.println("\nMago encontrado: " + mago.getNome());

                // Registrando uma ação especial
                mago.registrarAcao("Recebeu treinamento avançado");

                // Usando a interface Auditavel diretamente
                Auditavel auditor = (Auditavel) mago;

                System.out.println("Histórico atualizado:");
                auditor.auditarAcoes();

                // Aplicando uma bênção extra
                System.out.println("Bênção especial para magos:");

                Personagem p = (Personagem) mago;

                p.atribuirBencao(3.0);

                System.out.println("Novo poder base: "
                        + String.format("%.1f", p.getPoderBase()));
            }
        }

        // ===============================
        // Resumo da batalha
        // ===============================

        int qtdMagos = 0;
        int qtdGuerreiros = 0;
        int qtdCurandeiros = 0;

        double poderTotal = 0;

        for (Personagem personagem : personagens) {

            poderTotal += personagem.getPoderBase();

            if (personagem instanceof Mago) {

                qtdMagos++;

            } else if (personagem instanceof Guerreiro) {

                qtdGuerreiros++;

            } else if (personagem instanceof Curandeiro) {

                qtdCurandeiros++;
            }
        }

        System.out.println("\n==================================");
        System.out.println("RESUMO DA BATALHA");
        System.out.println("==================================");

        System.out.println("Total de personagens: " + personagens.size());
        System.out.println("Magos: " + qtdMagos);
        System.out.println("Guerreiros: " + qtdGuerreiros);
        System.out.println("Curandeiros: " + qtdCurandeiros);

        System.out.println("Poder total do grupo: "
                + String.format("%.1f", poderTotal));

        System.out.println("\n=== FIM DO SISTEMA ===");
    }
}