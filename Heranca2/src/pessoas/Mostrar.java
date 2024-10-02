package pessoas;
import complementos.*;
import java.time.LocalDate;

public class Mostrar {
    public static void main(String[] args) {
        // Mostrando a "classe" Vendedor com todos os atributos:
        Vendedor vendedor = new Vendedor("Taynara Raquel", "123.456.789-25", LocalDate.of(2003, 8, 15), LocalDate.of(2020, 1, 15), 1800.00, 8.5);
        System.out.println("Vendedor: " + vendedor.getNome() + "\nCPF: " + vendedor.getCpf() + "\nData de Nascimento: " + vendedor.getDataNascimento()+ "\nAdmitido em: "+vendedor.getContratacao()+ "\nSalário: R$" + vendedor.getSalario() + "\nComissão: " +vendedor.getComissao()+"%");

        // Mostrando/Exibindo a classe Gerente com todos os atributos pedidos:
    Ger gerente = new Ger("Lucas Queiroz", "157.258.369.27", LocalDate.of(2003, 7, 2), LocalDate.of(2021, 4, 2), 5000.00, "Reposição");
        System.out.println("\nGerente: " + gerente.getNome() + "\nCPF: "+gerente.getCpf()+ "\nNascido(a) em: "+gerente.getDataNascimento()+"\nContratado em: " +gerente.getDataContratacao()+"\nSalário: R$" + gerente.getSalarioBase()+"\nDep: " + gerente.getDepartamento() );

        // Exibindo todos os atributos da classe Cliente com os dados requisitados:
        Cliente cliente = new Cliente("Geovanna Oliveira", "471.236.479-12", LocalDate.of(2001, 5, 6), "geovannacarolinaoliveira@gmail.com", "55549217", "99770-8062");
        System.out.println("\nCliente: " + cliente.getNome() + "\nCPF: " + cliente.getCpf()+"\nData de Nascimento:"+cliente.getDataNascimento()+ "\nEmail: " + cliente.getEmail() + "\nCartão Fidelidade: " + cliente.getNumeroCartao()+"\nTelefone: " + cliente.getTelefone());
    }
}

