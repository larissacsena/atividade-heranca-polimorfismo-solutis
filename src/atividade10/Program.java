package atividade10;

import atividade8.model.Gerente;
import atividade8.model.Supervisor;
import atividade8.model.Vendedor;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Float.sum;

public class Program {

    public static void main(String[] args) {

        int totalFuncionarios = 10;

        int numGerentes = (int) (totalFuncionarios * 0.10);
        int numSupervisores = (int) (totalFuncionarios * 0.20);
        int numVendedores = totalFuncionarios - numGerentes - numSupervisores;

        List<Gerente> gerentes = new ArrayList<>();
        List<Supervisor> supervisores = new ArrayList<>();
        List<Vendedor> vendedores = new ArrayList<>();

        System.out.println("Distribuição dos Funcionários:");
        System.out.println("Gerentes: " + numGerentes);
        System.out.println("Supervisores: " + numSupervisores);
        System.out.println("Vendedores: " + numVendedores);
        System.out.println();

        for (int i = 0; i < numGerentes; i++) {
            Gerente gerente = new Gerente("Gerente " + (i + 1), "G" + (i + 1));
            gerentes.add(gerente);
            System.out.println(gerente);
        }

        for (int i = 0; i < numSupervisores; i++) {
            Supervisor supervisor = new Supervisor("Supervisor " + (i + 1), "S" + (i + 1));
            supervisores.add(supervisor);
            System.out.println(supervisor);
        }

        for (int i = 0; i < numVendedores; i++) {
            Vendedor vendedor = new Vendedor("Vendedor " + (i + 1), "V" + (i + 1));
            vendedores.add(vendedor);
            System.out.println(vendedor);
        }

        double gastoTotalGerentes = gerentes.stream().mapToDouble(Gerente::rendaTotal).sum();
        double gastoTotalSupervisores = supervisores.stream().mapToDouble(Supervisor::rendaTotal).sum();
        double gastoTotalVendedores = vendedores.stream().mapToDouble(Vendedor::rendaTotal).sum();

        double gastoTotalGeral = gastoTotalGerentes + gastoTotalSupervisores + gastoTotalVendedores;

        System.out.println("Gastos Totais:");
        System.out.println("Total gasto com Gerentes: R$ " + gastoTotalGerentes);
        System.out.println("Total gasto com Supervisores: R$ " + gastoTotalSupervisores);
        System.out.println("Total gasto com Vendedores: R$ " + gastoTotalVendedores);
        System.out.println("Gasto Total Geral: R$ " + gastoTotalGeral);
    }
}
