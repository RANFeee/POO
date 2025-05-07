import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AppUi extends JFrame {
    private JTextField txtDisciplina, txtNomeProf, txtEmailProf;
    private JRadioButton rbMatutino, rbVespertino, rbNoturno;
    private JRadioButton rbGraduacao, rbMestrado, rbDoutorado;
    private JButton btnIncluirAluno, btnListarDados;
    private Turma turma;

    public AppUi() {
        setTitle("Dados da Turma");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new GridLayout(0, 1));
        txtDisciplina = new JTextField(20);
        txtNomeProf = new JTextField(20);
        txtEmailProf = new JTextField(20);

        rbMatutino = new JRadioButton("Matutino");
        rbVespertino = new JRadioButton("Vespertino");
        rbNoturno = new JRadioButton("Noturno");
        ButtonGroup turnoGroup = new ButtonGroup();
        turnoGroup.add(rbMatutino);
        turnoGroup.add(rbVespertino);
        turnoGroup.add(rbNoturno);

        rbGraduacao = new JRadioButton("Graduação");
        rbMestrado = new JRadioButton("Mestrado");
        rbDoutorado = new JRadioButton("Doutorado");
        ButtonGroup titulacaoGroup = new ButtonGroup();
        titulacaoGroup.add(rbGraduacao);
        titulacaoGroup.add(rbMestrado);
        titulacaoGroup.add(rbDoutorado);

        btnIncluirAluno = new JButton("Incluir Aluno");
        btnListarDados = new JButton("Listar Dados da Turma");

        panel.add(new JLabel("Disciplina:"));
        panel.add(txtDisciplina);
        panel.add(new JLabel("Turno:"));
        panel.add(rbMatutino); panel.add(rbVespertino); panel.add(rbNoturno);
        panel.add(new JLabel("Nome do Professor:")); panel.add(txtNomeProf);
        panel.add(new JLabel("Email do Professor:")); panel.add(txtEmailProf);
        panel.add(new JLabel("Titulação:"));
        panel.add(rbGraduacao); panel.add(rbMestrado); panel.add(rbDoutorado);

        panel.add(btnIncluirAluno); panel.add(btnListarDados);
        add(panel);

        btnIncluirAluno.addActionListener(e -> abrirJanelaAluno());
        btnListarDados.addActionListener(e -> mostrarRelatorio());
    }

    private void abrirJanelaAluno() {
        if (turma == null) criarTurma();
        new AlunoUi(this, turma).setVisible(true);
    }

    private void mostrarRelatorio() {
        if (turma == null) criarTurma();
        JTextArea textArea = new JTextArea(turma.toString());
        textArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setPreferredSize(new Dimension(500, 300));
        JOptionPane.showMessageDialog(this, scroll, "Relatório da Turma", JOptionPane.INFORMATION_MESSAGE);
    }

    private void criarTurma() {
        String disciplina = txtDisciplina.getText();
        String turno = rbMatutino.isSelected() ? "Matutino" : rbVespertino.isSelected() ? "Vespertino" : "Noturno";
        String nomeProf = txtNomeProf.getText();
        String emailProf = txtEmailProf.getText();
        String titulacao = rbGraduacao.isSelected() ? "Graduação" : rbMestrado.isSelected() ? "Mestrado" : "Doutorado";
        Professor prof = new Professor(nomeProf, emailProf, titulacao);
        turma = new Turma(disciplina, turno, prof);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AppUi().setVisible(true));
    }
}