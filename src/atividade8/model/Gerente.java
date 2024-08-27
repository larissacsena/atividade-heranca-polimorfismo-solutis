package atividade8.model;

import atividade9_11.model.Funcionario;

public class Gerente extends Funcionario {

    private static final float COMISSAO_GERENTE = 1500.00f;

    public Gerente(String name, String employeeCode) {
        super(name, employeeCode);
        super.setComissao(COMISSAO_GERENTE);
    }

}
