package Funcionario;

import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina("CS101", "Introdução à Computação", "Fundamentos de Ciência da Computação", 60);
        Professor professor = new Professor("12345", "Dr. João Silva", LocalDate.of(2015, 3, 10), 5000.0, "Doutor", disciplina);

        Processo processo = new Processo(101, LocalDate.of(2020, 5, 15), "Processo de admissão de novos alunos");
        TecnicoAdministrativo tecnico = new TecnicoAdministrativo("54321", "Ana Maria", LocalDate.of(2010, 1, 5), 3000.0, 500.0, processo);

        professor.exibirRelatorio();
        System.out.println("------------------------------");
        tecnico.exibirRelatorio();
    }
}
