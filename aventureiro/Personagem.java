package aventureiro;

import java.util.Objects;

// Superclasse que representa um personagem do reino de Eldoria.
public class Personagem {

    // Atributos encapsulados
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    // Construtor
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        setNome(nome);
        setClasse(classe);
        setNivel(nivel);
        setPontosDeVida(pontosDeVida);
        setPoderBase(poderBase);
    }

    // Getters

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public double getPoderBase() {
        return poderBase;
    }

    // Setters com validações

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    public void setClasse(String classe) {
        if (classe != null && !classe.trim().isEmpty()) {
            this.classe = classe;
        }
    }

    public void setNivel(int nivel) {
        if (nivel >= 0) {
            this.nivel = nivel;
        }
    }

    public void setPontosDeVida(int pontosDeVida) {
        if (pontosDeVida >= 0) {
            this.pontosDeVida = pontosDeVida;
        }
    }

    public void setPoderBase(double poderBase) {
        if (poderBase >= 0) {
            this.poderBase = poderBase;
        }
    }

    // Método que será sobrescrito pelas subclasses
    public void usarHabilidade() {
        System.out.println(getNome() + " utiliza uma habilidade.");
    }

    // Exibe os dados do personagem
    @Override
    public String toString() {

        return "Nome: " + nome +
                "\nClasse: " + classe +
                "\nNível: " + nivel +
                "\nPontos de Vida: " + pontosDeVida +
                "\nPoder Base: " + poderBase;
    }

    // Dois personagens são iguais quando possuem o mesmo nome e a mesma classe
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Personagem outro = (Personagem) obj;

        return Objects.equals(nome, outro.nome)
                && Objects.equals(classe, outro.classe);
    }

    // Gera um hash compatível com equals()
    @Override
    public int hashCode() {
        return Objects.hash(nome, classe);
    }

}