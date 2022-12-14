package program;

import entidades.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
// questão aplicação um
        Funcionario gerente = new Funcionario();
        Funcionario atendente = new Funcionario();

// questão aplicação dois
        Cliente cliente = new Cliente();
        Endereco endereco1 = new Endereco("36603-11", "Parque Guarani", "32", "apto 3", "MG");
        Endereco endereco2 = new Endereco("87603-01", "Vivendas da Serra", "13", "apto 15", "ES");
        Endereco endereco3 = new Endereco("38234-11", "Bandeirantes", "27", "casa", "SP");
        cliente.adicionarEnderecoCliente(endereco1);
        cliente.adicionarEnderecoCliente(endereco2);
        cliente.adicionarEnderecoCliente(endereco3);

// questão aplicação três
        ContaCorrente cliente123 = new ContaCorrente("123", cliente);

        Credito credito = new Credito(100.00);
        Credito credito1 = new Credito(100.00);
        Credito credito2 = new Credito(100.00);

        cliente123.realizarDeposito(credito);
        cliente123.realizarDeposito(credito1);
        cliente123.realizarDeposito(credito2);


        System.out.println(cliente123.getsaldoConta());

        Debito debito = new Debito(50.00);
        cliente123.valorSaque(debito);
        System.out.println(cliente123.getsaldoConta());

// questão aplicação quatro
        Cliente cliente567 = new Cliente();
        ContaCorrente contaCorrente = new ContaCorrente("125",cliente567);

        Credito credito4 = new Credito(1000.00);

        contaCorrente.realizarDeposito(credito4);

        System.out.println(contaCorrente.getsaldoConta());

        Credito credito5 = new Credito(1000.00);

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.realizarDeposito(credito5);

        System.out.println(contaPoupanca.getsaldoConta());








    }
}
