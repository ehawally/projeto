package services;
import java.util.ArrayList;
import repositories.RepCliente;

public class FilaDeAgendamentos<T> {
    protected  ArrayList<T> elementos;

    public FilaDeAgendamentos (){
        this.elementos= new ArrayList<>();
}
    public void insert (T num){
        elementos.add(num);
}
    public T remove(){
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
    public T front() {
        if (empty()){
            System.out.println("Sem agendamentos registrados na fila ainda");
            return null;
        }
        return elementos.get(0);
    }
}

