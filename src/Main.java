import entities.Esteticista;
import entities.Procedimento;
import orders.OrdemServico;

public class Main {
    public static void main(String[] args) {

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
    }
}