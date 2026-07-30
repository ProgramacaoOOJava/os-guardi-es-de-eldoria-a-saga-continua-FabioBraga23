package mestre;

/**
 * Interface que define operações de auditoria para personagens.
 */
public interface Auditavel {

    /**
     * Registra uma ação realizada pelo personagem.
     *
     * @param acao Descrição da ação.
     */
    void registrarAcao(String acao);

    /**
     * Exibe todas as ações registradas.
     */
    void auditarAcoes();

}