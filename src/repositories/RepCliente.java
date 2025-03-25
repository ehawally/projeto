package repositories;
import java.util.List;
import java.util.ArrayList;
import interfaces.Repositorio;
import services.FilaDeAgendamentos;
import entities.Pessoa;


public class RepCliente<Cliente>  implements Repositorio<Cliente> {
    private FilaDeAgendamentos<Cliente> fila;

    public RepCliente() {
        this.fila = new FilaDeAgendamentos<>();
    }
    public String getNomeDeT(Cliente obj) {
        if (obj instanceof Pessoa) {
            return ((Pessoa) obj).getNome();
        }
        return null;
    }
    @Override
    public void salvar(Cliente cliente) {
        fila.enqueue(cliente);
    }

    @Override
    public Cliente excluir(String nome) {
        for (int i = 0; i < fila.size(); i++) {
            Cliente cliente = fila.elementos.get(i);
            String nomeCliente = getNomeDeT(cliente);
            if (nomeCliente != null && nomeCliente.equals(nome)) {
                fila.elementos.remove(i);
                System.out.println("Cliente removido: " + cliente);
                return cliente;
            }
        }
        System.out.println("Cliente não encontrado");
        return null;
    }
    @Override

    public List<Cliente> listarTodos() {
        List<Cliente> lista = new ArrayList<>();
        for (Cliente cliente : fila.elementos) {
            lista.add(cliente);
        }
        return lista;
    }

@Override
public Cliente buscaPorNome(String nome) {
    for (Cliente item : fila.elementos) {
        String nomeCliente = getNomeDeT(item);
        if (nomeCliente != null && nomeCliente.equals(nome)) {
            return item;
        }
    }
    return null;
}
@Override
public Cliente atualizar(Cliente obj) {
    String nome = getNomeDeT(obj);
    if (nome == null) return null;
    
    for (int i = 0; i < fila.size(); i++) {
        if (getNomeDeT(fila.elementos.get(i)).equals(nome)) {
            fila.elementos.set(i, obj);
            return obj;
        }
    }
    return null;
}

    public boolean isEmpty() {
        return fila.empty();
    }
}
