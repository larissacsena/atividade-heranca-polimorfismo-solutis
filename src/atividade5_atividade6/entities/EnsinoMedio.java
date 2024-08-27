package atividade5_atividade6.entities;

public class EnsinoMedio extends EnsinoBasico{
    private String schoolHighSchool;
    final float PERCENTAGE = 0.50f;
    private float basicImcome;

    public EnsinoMedio(String employeeCode, String name, String school, String schoolHighSchool) {
        super(employeeCode, name, school);
        this.schoolHighSchool = schoolHighSchool;
        super.setBasicIncome(super.getBasicIncome() + super.getBasicIncome() * PERCENTAGE);
    }

    public String getSchoolHighSchool() {
        return schoolHighSchool;
    }

    public void setSchoolHighSchool(String schoolHighSchool) {
        this.schoolHighSchool = schoolHighSchool;
    }

    @Override
    public String toString() {
        return super.toString() + "Escola Ensino Médio: " + schoolHighSchool + "\n";
    }
}
