package complementos;
import java.time.LocalDate;

//Adicionando Atributos à classe:
public class Cliente extends Pessoa {
    private String email;
    private String numCartao;
    private String telefone;

   
    //Construtor
    public Cliente(String nome, String cpf, LocalDate dataNascimento, String email, String numCartao, String telefone) {
        super(nome, cpf, dataNascimento);//Usando o Super para "chamar" os itens da SubClasse PESSOA
        this.email = email;
        this.numCartao = numCartao;
        this.telefone = telefone;
    }

    // get para chamar os atributos da classe
    public String getEmail() {
        return email;
    }

    public String getNumeroCartao() {
        return numCartao;
    }

    public String getTelefone() {
        return telefone;
    }

}
