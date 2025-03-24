package interfaces;
import java.util.List;

public interface Repositorio<T> {
    void salvar (T obj);
    T buscaPorNome(String Nome);
    T atualizar(T obj);
    T excluir(String Nome);
    List<T> listarTodos();
}