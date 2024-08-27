package atividade7_11;

import atividade5_atividade6.entities.EnsinoBasico;
import atividade5_atividade6.entities.EnsinoMedio;
import atividade5_atividade6.entities.Graduacao;
import atividade5_atividade6.model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private static final int TOTAL_EMPLOYEES = 10;
    private static final int BASIC_EDUCATION_LIMIT = 4;
    private static final int HIGH_SCHOOL_LIMIT = 8;

    public static void main(String[] args) {
        List<Funcionario> employees = new ArrayList<>();
        float totalSalary = 0;
        float basicEducationSalary = 0;
        float highSchoolSalary = 0;
        float collegeSalary = 0;

        for (int i = 0; i < TOTAL_EMPLOYEES; i++) {
            String employeeCode = String.format("E%03d", i + 1);
            String name = "Employee" + (i + 1);

            Funcionario employee;
            if (i < BASIC_EDUCATION_LIMIT) {
                employee = new EnsinoBasico(employeeCode, name, "Escola Ensino Básico" + (i + 1));
                basicEducationSalary += employee.getBasicIncome();
            } else if (i < HIGH_SCHOOL_LIMIT) {
                employee = new EnsinoMedio(employeeCode, name, "Escola Ensino Básico" + (i - BASIC_EDUCATION_LIMIT + 1), "Escola Ensino Médio" + (i - BASIC_EDUCATION_LIMIT + 1));
                highSchoolSalary += employee.getBasicIncome();
            } else {
                employee = new Graduacao(employeeCode, name, "Escola Ensino Básico" + (i - HIGH_SCHOOL_LIMIT + 1), "Escola Ensino Médio" + (i - HIGH_SCHOOL_LIMIT + 1), "Graduação" + (i - HIGH_SCHOOL_LIMIT + 1));
                collegeSalary += employee.getBasicIncome();
            }
            employees.add(employee);
        }

        employees.forEach(System.out::println);

        totalSalary = basicEducationSalary + highSchoolSalary + collegeSalary;
        printSalaryDetails(totalSalary, basicEducationSalary, highSchoolSalary, collegeSalary);
    }

    private static void printSalaryDetails(float total, float basicEducation, float highSchool, float college) {
        System.out.println("\nCusto Total de Salários: " + total);
        System.out.println("Custo de Salários com Ensino Básico: " + basicEducation);
        System.out.println("Custo de Salários com Ensino Médio: " + highSchool);
        System.out.println("Custo de Salários com Ensino Superior: " + college);
    }
}
