package orders;

import java.util.ArrayList;

import entities.Cliente;
import entities.Procedimento;

public class OrdemServico {
    public Cliente cliente;
    public ArrayList<Procedimento> procedimentos=new ArrayList<>();


    public OrdemServico (){

    }
    public OrdemServico(Cliente cliente){
        this.cliente=cliente; 

        
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void getProcedimento() {
    for (int i=0;i<procedimentos.size();i++){ 
        System.out.println(procedimentos.get(i));
    }

    }
    public void setProcedimento (Procedimento procedimento) {
        procedimentos.add(procedimento);


    } 
    public Double total () {
        double sum=0; 
        for (int i=0;i<procedimentos.size();i++){ 
        sum+=procedimentos.get(i).getPreco();
        }
        return sum;
    }  
}

