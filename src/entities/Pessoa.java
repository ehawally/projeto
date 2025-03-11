package entities;

abstract class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected String cpf;
    protected String dataNasc; 
    protected String email;
    protected int telefone;
    protected String rg;
    protected String endereco;
    protected String logradouro;
    protected int cep;
    

    public Pessoa(){

    } 
    public Pessoa( String nome,String sobrenome,String cpf,String dataNasc,String email,
    int telefone,String rg,String endereco,String logradouro,int cep){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.cpf=cpf;
        this.dataNasc=dataNasc;
        this.email=email;
        this.telefone=telefone;
        this.rg=rg;
        this.endereco=endereco; 
        this.logradouro=logradouro;
        this.cep=cep;

    } 

    public int getCep() {
        return cep;
    }
    public String getDataNasc() {
        return dataNasc;
    }
    public String getEmail() {
        return email;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getNome() {
        return nome;
    }
    public String getRg() {
        return rg;
    }
    public String getCpf() {
        return cpf;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public int getTelefone() {
        return telefone;
    }


    public void setCep(int cep) {
        this.cep = cep;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
}

