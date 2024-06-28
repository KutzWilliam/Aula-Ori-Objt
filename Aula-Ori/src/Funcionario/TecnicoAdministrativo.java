package Funcionario;
import java.time.*;

public class TecnicoAdministrativo extends Funcionario {
    private double adicionalNoturno;
    private Processo processo;

    public TecnicoAdministrativo(String registro, String nome, LocalDate dataAdmissao, double salarioBase, double adicionalNoturno, Processo processo) {
        super(registro, nome, dataAdmissao, salarioBase);
        this.adicionalNoturno = adicionalNoturno;
        this.processo = processo;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + adicionalNoturno;
    }

    @Override
    public void exibirRelatorio() {
        System.out.println("Registro: " + getRegistro());
        System.out.println("Nome: " + getNome());
        System.out.println("Data de Admissão: " + getDataAdmissao());
        System.out.println("Salário Total: " + calcularSalario());
        System.out.println("Processo: " + processo.getNumero());
        System.out.println("Data de Criação: " + processo.getDataCriacao());
        System.out.println("Descrição: " + processo.getDescricao());
    }

    // Getters e Setters
}

