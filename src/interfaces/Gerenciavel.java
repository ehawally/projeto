package interfaces;

import services.Servico;

public interface Gerenciavel {
    void adicionarServico(Servico servico);
    boolean verificarDisponibilidade (String nomeServico);
}
