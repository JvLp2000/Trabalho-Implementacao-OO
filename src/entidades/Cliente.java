package entidades;

import java.util.ArrayList;

public class Cliente extends Pessoa implements IUsuario {

    private ArrayList<Conta> listContas = new ArrayList<>();
    private ArrayList<Endereco> listEnderecos = new ArrayList<>();
    private boolean vip;

    private ContaCorrente contaCorrente;

    public Cliente(String cpf, String nome, String telefone, boolean vip) {
        super(cpf, nome, telefone);
        this.vip = vip;
    }

    public Cliente(String cpf, String nome, String telefone, boolean vip, ContaCorrente contaCorrente) {
        super(cpf, nome, telefone);
        this.vip = vip;
        this.contaCorrente = contaCorrente;
    }

    public Cliente() {

    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public void adicionarContaCliente(Conta conta){
        listContas.add(conta);

    }

    public void adicionarEnderecoCliente(Endereco endereco){
        listEnderecos.add(endereco);

    }

    public ArrayList<Conta> getListContas() {
        return listContas;
    }

    public ArrayList<Endereco> getListEnderecos() {
        return listEnderecos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "listContas=" + listContas +
                '}';
    }
}
