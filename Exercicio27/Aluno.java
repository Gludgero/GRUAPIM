package Exercicio27;

public class Aluno {
    private String nome;
    private double nota;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }
    public double getNota() {
        return nota;
    }

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
    
}
