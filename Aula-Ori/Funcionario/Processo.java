package Funcionario;

import java.time.LocalDate;

public class Processo {
    private int numero;
    private LocalDate dataCriacao;
    private String descricao;

    public Processo(int numero, LocalDate dataCriacao, String descricao) {
        this.numero = numero;
        this.dataCriacao = dataCriacao;
        this.descricao = descricao;
    }

    public int getNumero() {
        return numero;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public String getDescricao() {
        return descricao;
    }
}
