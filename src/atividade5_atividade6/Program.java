package atividade5_atividade6;

import atividade5_atividade6.entities.EnsinoBasico;
import atividade5_atividade6.entities.EnsinoMedio;
import atividade5_atividade6.entities.Graduacao;
import atividade5_atividade6.model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("E001", "Ana"));
        funcionarios.add(new EnsinoBasico("E002", "Pedro", "ABC School"));
        funcionarios.add(new EnsinoMedio("E003", "Maria", "DCE School", "XYZ School"));
        funcionarios.add(new Graduacao("E004", "João", "ABC School", "XYZ School", "DEF University"));

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
