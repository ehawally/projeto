package entities;
import java.util.ArrayList;
public class Procedimento {
    public String nomeProc;
    public double preco;
    public ArrayList <String>listaProdutos=new ArrayList<>();
    public int tempoMedioMin;
    public Esteticista esteticista;
    public String descricao;


    public Procedimento() {

    }
    public Procedimento(String nomeProc, double preco,int tempoMedioMin,
     Esteticista esteticista, String descricao) {
        this.nomeProc=nomeProc;
        this.preco=preco;
        this.tempoMedioMin=tempoMedioMin;
        this.esteticista=esteticista;
        this.descricao=descricao; 
    }

    public String getDescricao() {
        return descricao;
    }
    public Esteticista getEsteticista() {
        return esteticista;
    }
    public void  getListaProdutos() {
        for (int i=0;i<listaProdutos.size();i++){ 
            System.out.println(listaProdutos.get(i));

        }
    }
    public String getNomeProc() {
        return nomeProc;
    }
    public double getPreco() {
        return preco;
    }
    public int getTempoMedioMin() {
        return tempoMedioMin;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setEsteticista(Esteticista esteticista) {
        this.esteticista = esteticista;
    }
    public void setListaProdutos(String produto) {
        listaProdutos.add(produto) ;
    }
    public void setNomeProc(String nomeProc) {
        this.nomeProc = nomeProc;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setTempoMedioMin(int tempoMedioMin) {
        this.tempoMedioMin = tempoMedioMin;
    }
}