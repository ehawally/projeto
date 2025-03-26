package repositories;
import java.util.ArrayList;
import java.util.List;

public class FilaRepositorio<Cliente> {
    public  ArrayList<Cliente> elementos;

    public FilaRepositorio (){
        this.elementos= new ArrayList<>();
}
    public void enqueue (Cliente cliente){
        elementos.add(cliente);
} 
    public Cliente dequeue(){
        if (empty()){
            System.out.println("Sem disponibilidade na agenda");
            return null;
        }
        return elementos.remove(0);
    }
    public boolean empty() {
        return elementos.isEmpty();
}
    public int size(){
        return elementos.size();
    }
    public Cliente front() {
        if (empty()){
            System.out.println("Sem agendamentos registrados na fila ainda");
            return null;
        }
        return elementos.get(0);
    }

    public boolean isEmpty() {
        return elementos.isEmpty(); 
    }
    public List<Cliente> listarTodos() {
        return List.copyOf(elementos);
    }

}

