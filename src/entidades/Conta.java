package entidades;

public class Conta {
    private String numeroConta;
    private Double valorDebito;
    protected Double saldoConta = 0.00;
    private Cliente cliente;

    public Conta() {
    }

    public Conta(String numeroConta, Double valorDebito, Double saldoConta, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.valorDebito = valorDebito;
        this.cliente = cliente;
    }

    public Conta(String numeroConta, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    public Conta(String numeroConta, Double saldoConta, Cliente cliente) {
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getValorDebito() {
        return valorDebito;
    }

    public void setValorDebito(Double valorDebito) {
        this.valorDebito = valorDebito;
    }

    public Double getsaldoConta() {
        return saldoConta;
    }

    public void setsaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void realizarDeposito(Credito credito){
        saldoConta = saldoConta + credito.getValor();
    }

    public void valorSaque(Debito debito){
        if(saldoConta >= debito.getValor()){
            saldoConta -= debito.getValor();
        }
        else System.out.println("Valor insuficiente");
    }
}
