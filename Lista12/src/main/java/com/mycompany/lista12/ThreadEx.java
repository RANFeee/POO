
public class ThreadEx {
    private int valor;

    public ThreadEx(int valor) throws EstouroException, ForaIntervaloException, NegativoException {
        if (valor < 0) {
            throw new NegativoException("Valor negativo não permitido: " + valor);
        }
        if (valor > 1000) {
            throw new EstouroException("Valor excede o limite permitido: " + valor);
        }
        if (valor < 10 || valor > 500) {
            throw new ForaIntervaloException("Valor fora do intervalo permitido (10 a 500): " + valor);
        }
        this.valor = valor;
    }

    public void exibirValor() {
        System.out.println("Valor válido: " + valor);
    }

    public static void main(String[] args) {
        try {
            ThreadEx t1 = new ThreadEx(5);
            t1.exibirValor();
        } catch (EstouroException | ForaIntervaloException | NegativoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            ThreadEx t2 = new ThreadEx(100);
            t2.exibirValor();
        } catch (EstouroException | ForaIntervaloException | NegativoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
