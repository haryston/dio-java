import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Por favor, digite seu Nome: ");
       String NomeCliente = scanner.next();

       System.out.println("Por favor, digite o numero da conta: ");
       int numeroConta = scanner.nextInt();

       System.out.println("Por favor, digite o numero da Agência: ");
       String Agencia = scanner.next();

       
       System.out.println("Por favor, digite o seu saldo: ");
       double saldo = scanner.nextDouble();

       
        System.out.println("Olá, " +  NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ Agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
