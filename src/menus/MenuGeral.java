package menus;
import java.util.Scanner;

import entities.Cliente;
import entities.Pessoa;
import repositories.ListaSEncadeada;
import repositories.RepCliente;

public class MenuGeral {
     private RepCliente<Pessoa> repositorioClientes = new RepCliente<>();
    private ListaSEncadeada<String> lista = new ListaSEncadeada<>();
    private Scanner scanner = new Scanner(System.in);
        
    public void executarMenu() {
            int opcao;
            do {
                System.out.println("//////// Escolha a Disciplina ////////");
                System.out.println("1:Estrutura de Dados");
                System.out.println("2:Programação 2(Projeto do primeiro semestre)");
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
                System.out.println("1:Adicione ao início da lista");
                System.out.println("2:Adicione ao fim da lista");
                System.out.println("3:Insira numa posição específica");
                System.out.println("4:Remover Do início da lista");
                System.out.println("5:Remover do fim da lista");
                System.out.println("6:Remover por uma posição especifica");
                System.out.println("7: Ver tamanho da lista");
                System.out.println("8: Ver se está vazia");
                System.out.println("9: Listar todos");
                System.out.println("10: Voltar");
                System.out.println("====================================");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();   
        
            switch (opcao) {
                case 1:
                    System.out.print("Digite um nome para adicionar no início: ");
                    String nomeInicio = scanner.nextLine();
                    lista.addFirst(nomeInicio);
                    break;
                case 2:
                    System.out.print("Digite um nome para adicionar no fim: ");
                    String nomeFim = scanner.nextLine();
                    lista.addLast(nomeFim);
                    break;
                case 3:
                    System.out.print("Digite a posição: ");
                    int pos = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    lista.insertAt(pos, nome);
                    break;
                case 4:
                    lista.removeFirst();
                    break;
                case 5:
                    lista.removeLast();
                    break;
                case 6:
                    System.out.print("Digite a posição para remover: ");
                    int posRemover = scanner.nextInt();
                    scanner.nextLine();
                    lista.removeAt(posRemover);
                    break;
                case 7:
                    System.out.println("Tamanho da lista: " + lista.size());
                    break;
                case 8:
                    System.out.println(lista.isEmpty() ? "Lista está vazia" : "Lista contém elementos");
                    break;
                case 9:
                    System.out.println("Lista atual: " + lista.listarTodos());
                    break;
                case 10:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 10);
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
