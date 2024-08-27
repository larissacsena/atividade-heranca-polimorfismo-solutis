package atividade5_atividade6.model;

public class Funcionario {
    private String name;
    private String employeeCode;
    private float basicIncome = 1000f;

    public Funcionario(String name, String employeeCode) {
        this.name = name;
        this.employeeCode = employeeCode;
    }

    public float getBasicIncome() {
        return basicIncome;
    }

    public void setBasicIncome(float basicIncome) {
        this.basicIncome = basicIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Nome: " + name + "\n" +
                "Código do Funcionário: " + employeeCode + "\n" +
                "Renda Básica: " + basicIncome + "\n";
    }
}
