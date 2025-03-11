package orders;

import entities.Cliente;

public class FilaDeEspera {
    private static int maxFila = 10;
    private Cliente listaCliente[]= new Cliente[maxFila];
    
    public FilaDeEspera(){

    }

//loop que passa pelos elementos da pilha e imprime o nome e horario cadastrado do usuário 
    public String getCliente(Cliente c) {
        for (int i= 0; i < maxFila; i++){
            if (listaCliente[i]== c) {
                return "Nome: "+listaCliente[i].getNome()+ " Hora: " + listaCliente[i].getHora();

            }
            
         } 
         return "Cliente não encontrado";
    }

 //loop booleano que passa pela  fila pra checar a disponibilidade da pilha,com uma verificação leve no primeiro loop

    public void setCliente(Cliente cCliente) {

      for (int i = 0; i < maxFila; i++) {
           if (listaCliente[i] != null && listaCliente[i].equals(cCliente)) {
           System.out.println("Cliente já está na fila.");
              return; 
            }
        }

        boolean confirmacao = false; 
        for (int i= 0; i < maxFila; i++){
        if (listaCliente[i]== null) {
            listaCliente[i] = cCliente ;
            confirmacao=true;
            break;
            
        }
        
     }
     if(confirmacao){
        System.out.println("Agendamento Confirmado!");

     } 
     else {
        System.out.println("Lista Lotada");

     }

    }
}
