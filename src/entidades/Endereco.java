package entidades;

public class Endereco {

    private String cep;
    private String logadouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String UF;
    private Cliente cliente;

    public Endereco() {
    }

    public Endereco(String cep, String logadouro, String numero, String complemento, String cidade, String UF, Cliente cliente) {
        this.cep = cep;
        this.logadouro = logadouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.UF = UF;
        this.cliente = cliente;
    }

    public Endereco(String s, String vivendas_da_serra, String s1, String s2, String es) {
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
