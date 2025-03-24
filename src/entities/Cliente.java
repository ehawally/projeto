package entities;

public class Cliente extends Pessoa {
    protected Procedimento procedimento;
    protected String hora;

    public Cliente(  ) {
        this.procedimento = new Procedimento();
        this.hora = "00:00";
    }
    public Cliente(String Nome,String hora){
        this.hora=hora;
    }
    public Cliente(String nome, String sobrenome, String cpf, String dataNasc, String email, int telefone, 
    String rg, String endereco, String logradouro, int cep, Procedimento procedimento, String hora) {
        super(nome, sobrenome, cpf, dataNasc, email, telefone, rg, endereco, logradouro, cep);
        this.procedimento = procedimento;
        this.hora = hora;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome=nome;
    }
    public Cliente(Procedimento procedimento, String hora) {
        super("", "", "", "", "", 0, "", "", "", 0);  
        this.procedimento = procedimento;
        this.hora = hora;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    @Override
public String toString() {
    return "Cliente{" +
           " " + nome + '\'' +
           " " + sobrenome +
           '}';
}
}
