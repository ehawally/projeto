package repositories;
import java.util.List;
import java.util.ArrayList;
import interfaces.Repositorio;
import services.FilaDeAgendamentos;


public class RepCliente<T> implements Repositorio<T> {
    private FilaDeAgendamentos<T> fila;

    public RepCliente() {
        this.fila = new FilaDeAgendamentos<>();
    }

    @Override
    public void salvar(T cliente) {
        fila.insert(cliente);
    }

    @Override
    public T excluir(String nome) {
        return fila.remove();
}
    @Override
    public List<T> listarTodos() {
        List<T> lista = new ArrayList<>();
        while (!fila.empty()) {
            lista.add(fila.remove());
        }
        return lista;
    }
    @Override
    public T buscaPorNome(String nome) {
    for (T item : fila.elementos) {
        if (item.toString().equals(nome)) { // Ou se o T tiver getNome() seria item.getNome().equals(nome)
            return item;
        }
    }
    return null;
}
    @Override
    public T atualizar(T obj) {
        for (int i = 0; i < fila.size(); i++) {
        T item = fila.elementos.get(i);
        if (item.equals(obj)) {
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