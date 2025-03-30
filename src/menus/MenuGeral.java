package menus;
import java.util.Scanner;

import entities.Cliente;
import entities.Pessoa;
import repositories.FilaRepositorio;
import repositories.RepCliente;

public class MenuGeral {
     private RepCliente<Pessoa> repositorioClientes = new RepCliente<>();
    private FilaRepositorio<String> fila = new FilaRepositorio<>();
    private Scanner scanner = new Scanner(System.in);
        public void executarMenu() {
            int opcao;
            do {
                System.out.println("//////// Escolha a Disciplina ////////");
                System.out.println("1:Estrutura de Dados");
                System.out.println("2:Programação 2");
                System.out.println("3:Sair");
                System.out.println("====================================");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); 
    
                switch (opcao) {
                    case 1:
                        menuEstruturas();
                        break;
                    case 2:
                        menuProg2();
                        break;
                    case 3:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            } while (opcao != 3);
        }
    
        private void menuEstruturas() {
            int opcao;
            do {
                System.out.println("====================================");
                System.out.println("1:Adicione à fila");
                System.out.println("2:Remova da fila");
                System.out.println("3:Veja o primeiro da fila");
                System.out.println("4:Liste todos da fila");
                System.out.println("5:Voltar");
                System.out.println("====================================");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();   
        
        switch (opcao) {
            case 1:
                System.out.print("Digite um nome para adicionar: ");
                String nome = scanner.nextLine();
                fila.enqueue(nome);
                System.out.println(nome + " adicionado");
                break;
            case 2:
                String removido = fila.dequeue();
                if (removido != null) {
                    System.out.println(removido + " removido");
                }
                break;
            case 3:
                String primeiro = fila.front();
                if (primeiro != null) {
                    System.out.println("Primeiro da fila: " + primeiro);
                }
                break;
            case 4:
                System.out.println("Fila atual: " + fila.listarTodos());
                break;
            case 5:
                System.out.println("Voltando ao menu principal...");
                break;
            default:
                System.out.println("Opção inválida");
        }
    } while (opcao != 5);
}

    private void menuProg2() {
        int opcao;
        do {
            System.out.println("====================================");
            System.out.println("1:Cadastre cliente");
            System.out.println("2:Remova cliente");
            System.out.println("3:Busque cliente por nome");
            System.out.println("4:Atualize cliente");
            System.out.println("5:Liste todos os clientes");
            System.out.println("6:Voltar ao menu principal");
            System.out.println("====================================");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    Pessoa novoCliente = new Cliente(nome);
                    repositorioClientes.salvar(novoCliente);
                    System.out.println("Cliente Cadastrado");
                    break;
                case 2:
                    System.out.print("Digite o nome do cliente a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    repositorioClientes.excluir(nomeRemover);
                    break;
                case 3:
                    System.out.print("\nDigite o nome do cliente a ser buscado: ");
                    String nomeBusca = scanner.nextLine();
                    Pessoa encontrado = repositorioClientes.buscaPorNome(nomeBusca);
                    if (encontrado != null) {
                        System.out.println("Cliente encontrado: " + encontrado.getNome());
                    } else {
                        System.out.println("Cliente não encontrado");
                    }
                    break;
                case 4:
                    System.out.print("Digite o nome do cliente a ser atualizado: ");
                    String nomeAtualizar = scanner.nextLine();
                    Pessoa clienteExistente = repositorioClientes.buscaPorNome(nomeAtualizar);
                    if (clienteExistente != null) {
                        System.out.print("Digite o novo nome do cliente: ");
                        String novoNome = scanner.nextLine();
                        clienteExistente.setNome(novoNome);
                        repositorioClientes.atualizar(clienteExistente);
                        System.out.println("Cliente atualizado");
                    } else {
                        System.out.println("Cliente não encontrado");
                    }
                    break;
                case 5:
                    System.out.println("Lista de clientes cadastrados: ");
                    for (Pessoa cliente : repositorioClientes.listarTodos()) {
                        System.out.println(" - " + cliente.getNome());
                    }
                    break;
                case 6:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 6);
    }
}
