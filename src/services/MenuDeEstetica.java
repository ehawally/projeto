package services;
import java.util.ArrayList;

import interfaces.Gerenciavel;
public class MenuDeEstetica extends MenuServicos implements Gerenciavel {
    protected ArrayList<Servico> servicosDisponiveis = new ArrayList<>();

    @Override
    public void listarServicos() {
        System.out.println("Menu de Procedimentos Estéticos:");
        for (Servico servico : servicosDisponiveis) {
            servico.exibirDetalhes();
        }
    }

    @Override
    public void adicionarServico(Servico servico) {
        servicosDisponiveis.add(servico);
    }

    @Override
    public Servico buscarServico(String nome) {
        for (Servico servico : servicosDisponiveis) {
            if (servico.getNome().equalsIgnoreCase(nome)) {
                return servico;
            }
        }
        return null; 
    }

    @Override
    public boolean verificarDisponibilidade(String nomeServico) {
        for (Servico servico : servicosDisponiveis) {
            if (servico.getNome().equalsIgnoreCase(nomeServico)) {
                return true; 
            }
        }
        return false; 
    }
}