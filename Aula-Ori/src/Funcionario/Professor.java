package Funcionario;
import java.time.*;

public class Professor extends Funcionario {
    private String titulacao;
    private Disciplina disciplina;

    public Professor(String registro, String nome, LocalDate dataAdmissao, double salarioBase, String titulacao, Disciplina disciplina) {
        super(registro, nome, dataAdmissao, salarioBase);
        this.titulacao = titulacao;
        this.disciplina = disciplina;
    }

    @Override
    public double calcularSalario() {
        double gratificacao = 0;
        if (titulacao.equalsIgnoreCase("Mestre")) {
            gratificacao = 1000.0;
        } else if (titulacao.equalsIgnoreCase("Doutor")) {
            gratificacao = 2000.0;
        }
        return getSalarioBase() + gratificacao;
    }

    @Override
    public void exibirRelatorio() {
        System.out.println("Registro: " + getRegistro());
        System.out.println("Nome: " + getNome());
        System.out.println("Titulação: " + titulacao);
        System.out.println("Data de Admissão: " + getDataAdmissao());
        System.out.println("Salário Total: " + calcularSalario());
        System.out.println("Disciplina: " + disciplina.getCodigo());
        System.out.println("Nome da Disciplina: " + disciplina.getNome());
        System.out.println("Ementa: " + disciplina.getEmenta());
        System.out.println("Carga Horária: " + disciplina.getCargaHoraria());
    }

}

