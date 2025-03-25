package interfaces;
import java.util.List;

public interface Repositorio<Cliente> {
    void salvar (Cliente obj);
    Cliente buscaPorNome(String Nome);
    Cliente atualizar(Cliente obj);
    Cliente excluir(String Nome);
    List<Cliente> listarTodos();
}