import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da sua conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o numero da sua agencia:");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome :");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite o seu Saldo");
        Double saldo = scanner.nextDouble();

        System.out.println("Ola " + nomeCliente + " " + sobrenome + ",obrigado por criar uma conta em nosso banco,sua agencia é " + agencia + ",conta " + numero + ", e seu saldo " + saldo + " ja esta disponivel para saque!");
    }


}
