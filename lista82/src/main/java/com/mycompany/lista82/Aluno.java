public class Aluno {
    private String nome;
    private String matricula;
    private double notaEnem;

    public Aluno(String nome, String matricula, double notaEnem) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaEnem = notaEnem;
    }

    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }
    public double getNotaEnem() { return notaEnem; }

    @Override
    public String toString() {
        return "Aluno: " + nome + " - Matrícula: " + matricula + " - Nota ENEM: " + notaEnem;
    }
}