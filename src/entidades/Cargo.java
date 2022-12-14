package entidades;

import java.util.ArrayList;

public class Cargo {
    private String nomeCargo;

    private ArrayList<Funcionario> listFuncionario;

    public Cargo() {
    }

    public Cargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public ArrayList<Funcionario> getListFuncionario() {
        return listFuncionario;
    }

    public void adicionarFuncionario(Funcionario funcionario){
        listFuncionario.add(funcionario);
    }
}
