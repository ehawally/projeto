package repositories;
import java.util.List;
import java.util.ArrayList;
import interfaces.Repositorio;
import entities.Pessoa;


public class RepCliente<Cliente extends Pessoa>  implements Repositorio<Cliente> {
    private List<Cliente> clientes;

    public RepCliente() {
        this.clientes = new ArrayList<>();
    }
    public String getNomeDeT(Cliente obj) {
        if (obj instanceof Pessoa) {
            return ((Pessoa) obj).getNome();
        }
        return null;
    }
@Override
    public void salvar(Cliente cliente) {
        clientes.add(cliente);
    }

@Override
    public Cliente excluir(String nome) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            String nomeCliente = getNomeDeT(cliente);
            if (nomeCliente != null && nomeCliente.equals(nome)) {
                clientes.remove(i);
                System.out.println("Cliente removido: " + cliente);
                return cliente;
            }
        }
        System.out.println("Cliente não encontrado");
        return null;
    }
@Override

    public List<Cliente> listarTodos() {
        return new ArrayList<>(clientes); 
    }

@Override
    public Cliente buscaPorNome(String nome) {
        for (Cliente cliente : clientes) {
            String nomeCliente = getNomeDeT(cliente);
                if (nomeCliente != null && nomeCliente.equals(nome)) {
            return cliente;
        }
    }
    return null;
}
@Override
public Cliente atualizar(Cliente obj) {
    String nome = getNomeDeT(obj);
    if (nome == null) return null;
    for (int i = 0; i < clientes.size(); i++) {
        if (getNomeDeT(clientes.get(i)).equals(nome)) {
            Cliente clienteExistente = clientes.get(i);
            clienteExistente.setNome(obj.getNome());
            return clienteExistente;
        }
    }
    return null;
}
}