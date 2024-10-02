package complementos;
import java.time.LocalDate;

//Informando os atributos e chamando os iniciais da outra classe.

public class Ger extends Pessoa {
    private LocalDate dataContratacao;
    private double salarioBase;
    private String departamento;

    //Construtor para a classe Gerente
    public Ger(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase, String departamento) {
        super(nome, cpf, dataNascimento);//Usando o Super para "chamar" os itens da SubClasse PESSOA
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    // Get para chamar o atributo da classe privada
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getDepartamento() {
        return departamento;
    }

}

