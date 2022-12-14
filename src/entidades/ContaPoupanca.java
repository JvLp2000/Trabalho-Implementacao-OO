package entidades;

public class ContaPoupanca extends Conta{
    private Double rentabilidadeMensal;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String numeroConta, Double valorDebito, Double saldoConta, Cliente cliente, Double rentabilidadeMensal) {
        super(numeroConta, valorDebito, saldoConta, cliente);
        this.rentabilidadeMensal = rentabilidadeMensal;
    }

    public ContaPoupanca(Credito credito5) {
    }

    public Double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }

    public void setRentabilidadeMensal(Double rentabilidadeMensal) {
        this.rentabilidadeMensal = rentabilidadeMensal;
    }

    public Double calcularSaldo(Double quantidadeMeses){
        return this.saldoConta += (this.saldoConta * rentabilidadeMensal) * rentabilidadeMensal;
    }
}
