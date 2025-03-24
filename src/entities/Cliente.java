package entities;
import entities.Pessoa;

public class Cliente extends Pessoa {
    protected Procedimento procedimento;
    private String hora;

    public Cliente(String nome, String sobrenome, String cpf, String dataNasc, String email, int telefone, 
    String rg, String endereco, String logradouro, int cep, Procedimento procedimento, String hora) {
        super(nome, sobrenome, cpf, dataNasc, email, telefone, rg, endereco, logradouro, cep);
        this.procedimento = procedimento;
        this.hora = hora;
    }

    public Cliente(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf, "", "", 0, "", "", "", 0);  
        this.procedimento = new Procedimento();  
        this.hora = "08:00";  
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
}
