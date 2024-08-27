package atividade5_atividade6.entities;

public class Graduacao extends EnsinoMedio {

    private String university;
    final float PERCENTAGE = 1.0f;
    private float basicImcome;

    public Graduacao(String employeeCode, String name, String school, String schoolHighSchool, String university) {
        super(employeeCode, name, school, schoolHighSchool);
        this.university = university;
        super.setBasicIncome(super.getBasicIncome() + super.getBasicIncome() * PERCENTAGE);
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return super.toString() + "Universidade: " + university + "\n";
    }
}
