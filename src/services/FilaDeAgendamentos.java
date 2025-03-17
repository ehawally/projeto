package services;
import java.util.ArrayList;
import repositories.RepCliente;

public class FilaDeAgendamentos {
    protected RepCliente[] elementos;
    protected int capacidade;
    protected int inicio;
    protected int fim;
    protected int tamanho;

public FilaDeAgendamentos(int capacidade){
    this.capacidade = capacidade;
    this.elementos = (RepCliente[]) new RepCliente[capacidade]; 
    this.inicio= 0;
    this.fim = -1;
    this.tamanho= 0;
}
public void insert (RepCliente valor){
    if (tamanho== capacidade) {
        System.out.println("Sem disponibilidade para agendamento" +valor);
        return;
    };


    fim = (fim+1) % capacidade;
    elementos[fim]= valor;
    tamanho++;
}
}

