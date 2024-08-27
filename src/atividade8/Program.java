package atividade8;

import atividade9_11.model.Funcionario;
import atividade8.model.Gerente;
import atividade8.model.Supervisor;
import atividade8.model.Vendedor;

public class Program {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Alex", "200");
        Funcionario supervisor = new Supervisor("Ana", "201");
        Funcionario vendedor = new Vendedor("João","202");

        System.out.println("Comissão do Gerente: R$ " + gerente.rendaTotal());
        System.out.println("Comissão do Supervisor: R$ " + supervisor.rendaTotal());
        System.out.println("Comissão do Vendedor: R$ " + vendedor.rendaTotal());
    }
}
