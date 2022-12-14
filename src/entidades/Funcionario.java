package entidades;

import java.util.ArrayList;

public class Funcionario extends Pessoa implements IUsuario{

    private Double salario;
    private ArrayList<Cargo>listCargos;


    public Funcionario(String cpf, String nome, String telefone, Double salario) {
        super(cpf, nome, telefone);
        this.salario = salario;
    }

    public Funcionario() {

    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public ArrayList<Cargo> getListCargos() {
        return listCargos;
    }

    public void adicionarCargo(Cargo cargo){
        listCargos.add(cargo);
    }
}
