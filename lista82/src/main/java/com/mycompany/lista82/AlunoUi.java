import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AlunoUi extends JDialog {
    private JTextField txtNome, txtMatricula, txtNota;
    private JButton btnConfirmar, btnCancelar;
    private Turma turma;

    public AlunoUi(JFrame parent, Turma turma) {
        super(parent, "Cadastro de Aluno", true);
        this.turma = turma;
        setSize(300, 200);
        setLocationRelativeTo(parent);
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new GridLayout(0, 1));

        txtNome = new JTextField();
        txtMatricula = new JTextField();
        txtNota = new JTextField();

        btnConfirmar = new JButton("Confirmar");
        btnCancelar = new JButton("Cancelar");

        panel.add(new JLabel("Nome do Aluno:"));
        panel.add(txtNome);
        panel.add(new JLabel("Número da Matrícula:"));
        panel.add(txtMatricula);
        panel.add(new JLabel("Nota ENEM:"));
        panel.add(txtNota);
        panel.add(btnConfirmar);
        panel.add(btnCancelar);

        add(panel);

        btnConfirmar.addActionListener(e -> confirmar());
        btnCancelar.addActionListener(e -> dispose());
    }

    private void confirmar() {
        try {
            String nome = txtNome.getText();
            String matricula = txtMatricula.getText();
            double nota = Double.parseDouble(txtNota.getText());
            Aluno aluno = new Aluno(nome, matricula, nota);
            turma.adicionarAluno(aluno);
            dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nota inválida", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}