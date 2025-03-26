import repositories.FilaRepositorio;
import repositories.RepCliente;
import entities.Cliente;
import entities.Esteticista;
import entities.Procedimento;

public class Main {
    public static void main(String[] args) {
        FilaRepositorio<Cliente> fila = new FilaRepositorio<>();
        FilaRepositorio<Cliente> fila2 = new FilaRepositorio<>();
        RepCliente<Cliente> repo = new RepCliente<>();
        Cliente c1 = new Cliente();
        c1.setNome("Carlos");
        c1.setSobrenome("Moretto");

        Cliente c2 = new Cliente();
        c2.setNome("Mariana");
        c2.setSobrenome("Moretto");

        Cliente c3= new Cliente();
        c3.setNome("Fulano");
        c3.setSobrenome("De Tal");

        fila.enqueue(c1);
        fila.enqueue(c2);
        fila.enqueue(c3);

        System.out.println("A fila está vazia? " + (fila.isEmpty() ? "Vazia" : "A fila não está vazia"));
        System.out.println("E se ela estivesse?... como que apareceria: " + (fila2.isEmpty() ? "Vazia" : "A fila não está vazia"));
        System.out.println("Primeiro Cliente Atual: " + fila.front());
        System.out.println("Quantas pessoas na fila "+ fila.size());
        System.out.println("Cliente Removido: " + fila.dequeue());
        System.out.println("Cliente Removido: " + fila.dequeue());
        System.out.println("Primeiro Cliente Atual: " + fila.front());
        System.out.println("A fila está vazia? " + fila.isEmpty());
        System.out.println("E se ela estivesse?... como que apareceria: "+ fila2.isEmpty());
        System.out.println("E agora tem quantos na fila: " +fila.size());
        Cliente c4= new Cliente();
        c4.setNome("Bianca");
        c4.setSobrenome("Fulaninha");
        fila.enqueue(c4);
        System.out.println("Todos os clientes: " + fila.listarTodos());
        
}
}