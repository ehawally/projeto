package services;

public abstract class Servico {
    public String nome;
    public double preco;

public Servico(String nome, double preco){
    this.nome =nome;
    this.preco = preco;
}
public String getNome() {
    return nome;
}
public double getPreco() {
    return preco;
}
public abstract void exibirDetalhes();
}
