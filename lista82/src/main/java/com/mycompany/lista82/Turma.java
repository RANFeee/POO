import java.util.ArrayList;

public class Turma {
    private String disciplina;
    private String turno;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String disciplina, String turno, Professor professor) {
        this.disciplina = disciplina;
        this.turno = turno;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno obterAlunoMelhorNotaEnem() {
        if (alunos.isEmpty()) return null;

        Aluno melhor = alunos.get(0);
        for (Aluno a : alunos) {
            if (a.getNotaEnem() > melhor.getNotaEnem()) {
                melhor = a;
            }
        }
        return melhor;
    }

    public ArrayList<Aluno> getAlunos() {
        return new ArrayList<>(alunos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Turma: ").append(disciplina).append("\n")
          .append("Turno: ").append(turno).append("\n")
          .append(professor).append("\n\n");

        for (Aluno a : alunos) {
            sb.append(a).append("\n");
        }

        Aluno melhor = obterAlunoMelhorNotaEnem();
        if (melhor != null) {
            sb.append("\nAluno com maior nota ENEM:\n").append(melhor);
        }

        return sb.toString();
    }
}