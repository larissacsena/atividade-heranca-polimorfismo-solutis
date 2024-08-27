package atividade8.model;

import atividade9_11.model.Funcionario;

public class Vendedor extends Funcionario {
    private static final float COMISSAO_VENDEDOR = 250.00f;

    public Vendedor(String name, String employeeCode) {
        super(name, employeeCode);
        super.setComissao(COMISSAO_VENDEDOR);
    }
}
