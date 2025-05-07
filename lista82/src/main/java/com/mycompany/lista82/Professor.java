public class Professor {
    private String nome;
    private String email;
    private String titulacao;

    public Professor(String nome, String email, String titulacao) {
        this.nome = nome;
        this.email = email;
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Professor: " + nome + "\nTitulação: " + titulacao + "\nE-mail: " + email;
    }
}