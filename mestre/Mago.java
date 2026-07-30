package mestre;

import java.util.ArrayList;

// Classe que representa um personagem da classe Mago.
public class Mago extends Personagem implements Auditavel {

    // Lista para armazenar as ações realizadas pelo mago
    private ArrayList<String> acoes;

    // Construtor
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        acoes = new ArrayList<>();
    }

    // Habilidade exclusiva do mago
    @Override
    public void usarHabilidade() {

        System.out.println("Habilidade: " + getNome() + " conjura uma bola de fogo!");
    }

    // Registra uma ação realizada
    @Override
    public void registrarAcao(String acao) {

        acoes.add(acao);
    }

    // Exibe todas as ações registradas
    @Override
    public void auditarAcoes() {

        System.out.println("Ações auditadas:");

        acoes.forEach(acao -> System.out.println("- " + acao));
    }

}