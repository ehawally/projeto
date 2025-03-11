package entities;

public class Cliente extends Pessoa {
    protected Procedimento procedimento;
    private String hora;


    public Cliente(){

    }
    public Cliente(Procedimento procedimento, String hora){
        this.procedimento=procedimento;
        this.hora=hora;
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

