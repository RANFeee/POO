import java.util.ArrayList;
import java.util.List;

// Interface Pagavel
interface Pagavel {
    double calcularValorPagar();
}

// Classe ContaAgua
class ContaAgua implements Pagavel {
    private int metrosCubicos;
    private double precoMetroCubico;

    public ContaAgua(int metrosCubicos, double precoMetroCubico) {
        this.metrosCubicos = metrosCubicos;
        this.precoMetroCubico = precoMetroCubico;
    }

    @Override
    public double calcularValorPagar() {
        return metrosCubicos * precoMetroCubico;
    }
}

// Classe MensalidadeEnsino
class MensalidadeEnsino implements Pagavel {
    private int nrCreditos;
    private double precoCredito;

    public MensalidadeEnsino(int nrCreditos, double precoCredito) {
        this.nrCreditos = nrCreditos;
        this.precoCredito = precoCredito;
    }

    @Override
    public double calcularValorPagar() {
        return nrCreditos * precoCredito;
    }
}

// Classe Investimento
class Investimento {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

// Classe PrevidenciaPrivada
class PrevidenciaPrivada implements Pagavel {
    private double valor;

    public PrevidenciaPrivada(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularValorPagar() {
        return valor;
    }

    public void investir() {
        System.out.println("Investindo em Previdência Privada: R$ " + valor);
    }

    public double getValor() {
        return valor;
    }
}

// Classe Contas
class Contas {
    private List<Pagavel> contas;

    public Contas() {
        this.contas = new ArrayList<>();
    }

    public void incluirConta(Pagavel conta) {
        contas.add(conta);
    }

    public List<Pagavel> getContas() {
        return contas;
    }

    public double calcularTotalContas() {
        double total = 0;
        for (Pagavel conta : contas) {
            total += conta.calcularValorPagar();
        }
        return total;
    }
}

// Classe Main para testes
public class Main {
    public static void main(String[] args) {
        Contas contas = new Contas();

        // Adicionando contas
        contas.incluirConta(new ContaAgua(15, 2.5)); // 15m³ a R$ 2,50
        contas.incluirConta(new MensalidadeEnsino(5, 300)); // 5 créditos a R$ 300 cada
        contas.incluirConta(new PrevidenciaPrivada(1000)); // R$ 1000 de previdência

        // Exibindo o total
        System.out.println("Total das contas: R$ " + contas.calcularTotalContas());

        // Exibindo as contas de Previdência
        System.out.println("\nContas de Previdência Privada:");
        for (Pagavel pagavel : contas.getContas()) {
            if (pagavel instanceof PrevidenciaPrivada) {
                PrevidenciaPrivada previdencia = (PrevidenciaPrivada) pagavel;
                System.out.println("Valor investido: R$ " + previdencia.getValor());
            }
        }
    }
}
