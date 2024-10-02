package complementos;
import java.time.LocalDate;

//Informando os atributos e chamando os iniciais da outra classe.
public class Vendedor extends Pessoa {
    private LocalDate data;
    private double salario;
    private double comissao;

   //Construtor + os da classe pessoa
    public Vendedor(String nome, String cpf, LocalDate dataNascimento, LocalDate data, double salario, double comissao) {
        super(nome, cpf, dataNascimento);//Usando o Super para "chamar" os itens da SubClasse PESSOA
        this.data = data;
        this.salario = salario;
        this.comissao = comissao;
    }

    // Gets
    public LocalDate getContratacao() {
        return data;
    }

    public double getSalario() {
        return salario;
    }

    public double getComissao() {
        return comissao;
    }

}

