package services;
import java.util.ArrayList;


public class FilaDeAgendamentos<Cliente> {
    public  ArrayList<Cliente> elementos;

    public FilaDeAgendamentos (){
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

}

