import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //NUMERO DA CONTA BANCARIA
        System.out.println("Digite o numero da sua conta:");
        int numero = scanner.nextInt();
        
        //NUMERO DA AGENCIA BANCARIA
        System.out.println("Digite o numero da sua agencia:");
        String agencia = scanner.next();

        //NOME DO CLIENTE
        System.out.println("Digite o seu nome :");
        String nomeCliente = scanner.next();

        //SOBRENOME CLIENTE
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();
        
        //SALDO DO CLIENTE
        System.out.println("Digite o seu Saldo");
        Double saldo = scanner.nextDouble();

        //SAIDA EM TEXTO PARA VISUALIZAÇAO DO CLIENTE JA CONTENTO AS VARIAVEIS
        System.out.println("Ola " + nomeCliente + " " + sobrenome + ",obrigado por criar uma conta em nosso banco,sua agencia é " + agencia + ",conta " + numero + ", e seu saldo " + saldo + " ja esta disponivel para saque!");
    }


}
