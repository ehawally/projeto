package repositories;
import java.util.List;
import java.util.ArrayList;
import interfaces.Repositorio;
import services.FilaDeAgendamentos;
import entities.Pessoa;


public class RepCliente<T>  implements Repositorio<T> {
    private FilaDeAgendamentos<T> fila;

    public RepCliente() {
        this.fila = new FilaDeAgendamentos<>();
    }
    public String getNomeDeT(T obj) {
        if (obj instanceof Pessoa) {
            return ((Pessoa) obj).getNome();
        }
        return null;
    }
    @Override
    public void salvar(T cliente) {
        fila.insert(cliente);
    }

    @Override
    public T excluir(String nome) {
        for (int i = 0; i < fila.size(); i++) {
            T cliente = fila.elementos.get(i);
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

    public List<T> listarTodos() {
        List<T> lista = new ArrayList<>();
        for (T cliente : fila.elementos) {
            lista.add(cliente);
        }
        return lista;
    }

@Override
public T buscaPorNome(String nome) {
    for (T item : fila.elementos) {
        String nomeCliente = getNomeDeT(item);
        if (nomeCliente != null && nomeCliente.equals(nome)) {
            return item;
        }
    }
    return null;
}
@Override
public T atualizar(T obj) {
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
