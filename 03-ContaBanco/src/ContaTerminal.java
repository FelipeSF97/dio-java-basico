import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String numero;
        String agencia;
        String nomeCliente;
        String saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextLine();

    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
    + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
