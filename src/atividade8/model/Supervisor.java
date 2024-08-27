package atividade8.model;

import atividade9_11.model.Funcionario;

public class Supervisor extends Funcionario {

    private static final float COMISSAO_SUPERVISOR = 600.00f;

    public Supervisor(String name, String employeeCode) {
        super(name, employeeCode);
        super.setComissao(COMISSAO_SUPERVISOR);

    }

}
