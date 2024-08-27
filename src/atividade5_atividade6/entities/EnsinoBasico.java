package atividade5_atividade6.entities;

import atividade5_atividade6.model.Funcionario;

public class EnsinoBasico extends Funcionario {

    private String schoolBasic;
    final float PERCENTAGE = 0.10f;

    public EnsinoBasico(String name, String employeeCode, String schoolBasic) {
        super(name, employeeCode);
        super.setBasicIncome(super.getBasicIncome() + super.getBasicIncome() * PERCENTAGE);
        this.schoolBasic = schoolBasic;
    }

    public String getSchool() {
        return schoolBasic;
    }

    public void setSchool(String school) {
        this.schoolBasic = school;
    }

    @Override
    public String toString() {
        return super.toString() + "Escola Ensino Básico: " + schoolBasic + "\n";
    }
}
