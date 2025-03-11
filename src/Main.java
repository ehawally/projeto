import entities.Cliente;
import entities.Esteticista;
import entities.Procedimento;
import orders.FilaDeEspera;
import orders.OrdemServico;

public class Main {
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente();
        FilaDeEspera f1 = new FilaDeEspera();
        c1.setNome("Marcoooper");
        c1.setHora("14:00");
        c1.setCep(0);
        Cliente c2= new Cliente();
        c2.setNome("Kaio Bicha");
        c2.setHora("15:00");
        Esteticista e1= new Esteticista();
        Procedimento pro1= new  Procedimento (); 
        Procedimento pro2= new  Procedimento ();
        Procedimento pro3= new  Procedimento ();
        pro1.setPreco(12.90);
        pro2.setPreco (13.87);
        pro3.setPreco (90.00);

        OrdemServico oS= new OrdemServico();
        oS.setProcedimento(pro3);
        oS.setProcedimento(pro2);
        oS.setProcedimento(pro1);
        double total= oS.total();  
        System.out.println("preço total: "+ total);
        f1.setCliente(c1);
        f1.setCliente(c1);
        f1.setCliente(c1);
        f1.setCliente(c1);
        f1.setCliente(c1);
        f1.setCliente(c1);
        f1.setCliente(c1);
        f1.setCliente(c1);
        f1.setCliente(c1);
        f1.setCliente(c2);
        f1.setCliente(c1);
        System.out.println(f1. getCliente(c1));
        System.out.println(f1. getCliente(c2));
    }
}