package entidades;

public class ContaCorrente extends Conta {
    private Double limite;

    public ContaCorrente() {
    }

    public ContaCorrente(String numeroConta, Double saldoConta, Cliente cliente, Double limite) {
        super(numeroConta,saldoConta, cliente);
        this.limite = limite;
    }

    public ContaCorrente(String s, Cliente cliente) {
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void realizaTransferencia(Conta contaDestino, Double valorTranferencia){

    }

    public Double calcularSaldo(){
        return null;
    }

    public void realizarTransferencia(Debito debito, Conta conta) {
        Double valorTotal = saldoConta + limite;
        if(valorTotal >= debito.getValor()){
            saldoConta -= valorTotal;
            conta.setsaldoConta(valorTotal);
        }
        else System.out.println("Você é pobre");
    }
}
