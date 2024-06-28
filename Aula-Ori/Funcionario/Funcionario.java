package Funcionario;

import java.time.LocalDate;

public abstract class Funcionario {
    private String registro;
    private String nome;
    private LocalDate dataAdmissao;
    private double salarioBase;

    public Funcionario(String registro, String nome, LocalDate dataAdmissao, double salarioBase) {
        this.registro = registro;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract void exibirRelatorio();
}

