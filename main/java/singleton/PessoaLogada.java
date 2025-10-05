package singleton;

public class PessoaLogada {
    private PessoaLogada(){};
    private static PessoaLogada instance = new PessoaLogada();
    public static PessoaLogada getInstance(){return instance;}

    private String cpf;
    private String nome;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.equals("")){
            throw new IllegalArgumentException("CPF inválido!");
        }
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.equals("")){
            throw new IllegalArgumentException("Nome inválido!");
        }
        this.nome = nome;
    }
}
