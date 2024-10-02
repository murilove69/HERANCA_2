package complementos;
import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;//Determinação do "tipo" de data.

    
    //Construtor
    public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // Gets para "chamar" os atributos
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}

