
package entities;
import java.util.ArrayList;
public class Esteticista extends Pessoa {
    protected ArrayList <String> cursos=new ArrayList<>();
    protected String banco;
    protected int agencia;
    protected int numeroConta;

    public Esteticista() {
    
    
    }
    public Esteticista(String banco, int agencia, int numeroConta) {
     this.banco=banco;
     this.agencia=agencia;
     this.numeroConta=numeroConta;


    }
    public String getBanco() {
        return banco;
    }
    public int getAgencia() {
        return agencia;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void getCursos() {
        for (int i=0;i<cursos.size();i++){ 
            System.out.println(cursos.get(i));

        }
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setCursos(String curso) {
        cursos.add(curso);
    }   
}