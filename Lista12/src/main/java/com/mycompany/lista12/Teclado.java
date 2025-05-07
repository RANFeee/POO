
import java.util.Scanner;

public class Teclado {
    private Scanner scanner;

    public Teclado() {
        scanner = new Scanner(System.in);
    }

    public int lerInt() {
        while (true) {
            try {
                System.out.print("Digite um número inteiro: ");
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        }
    }

    public double lerDouble() {
        while (true) {
            try {
                System.out.print("Digite um número decimal: ");
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        }
    }

    public boolean lerBoolean() {
        while (true) {
            System.out.print("Digite (sim/verdadeiro/positivo/s ou nao/falso/negativo/n): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("sim") || input.equals("verdadeiro") || input.equals("positivo") || input.equals("s")) {
                return true;
            } else if (input.equals("nao") || input.equals("falso") || input.equals("negativo") || input.equals("n")) {
                return false;
            } else {
                System.out.println("Valor inválido. Tente novamente.");
            }
        }
    }

    public String lerString() {
        System.out.print("Digite um texto: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        
        int inteiro = teclado.lerInt();
        double decimal = teclado.lerDouble();
        boolean bool = teclado.lerBoolean();
        String texto = teclado.lerString();

        System.out.println("Inteiro lido: " + inteiro);
        System.out.println("Decimal lido: " + decimal);
        System.out.println("Booleano lido: " + bool);
        System.out.println("Texto lido: " + texto);
    }
}
