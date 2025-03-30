package menus;

import services.Servico;

public abstract class MenuServicos {
    public abstract void listarServicos();
    public abstract void adicionarServico(Servico servico);
    public abstract Servico buscarServico(String nome);
}
