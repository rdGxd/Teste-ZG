import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite quantos meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite quantos dias: ");
        int dias = scanner.nextInt();

        int idadeEmDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("A idade em dias é: " + idadeEmDias);
    }
}