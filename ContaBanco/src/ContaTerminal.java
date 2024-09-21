import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número da conta: ");
        int numeroConta = scanner.nextInt(); 
   
        System.out.println("Insira a agência: ");
        String agencia = scanner.next();
   
        System.out.println("Informe o seu nome: ");
        String nomeCliente = scanner.next();
   
        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo é de R$ %.2f já disponível para saque.", nomeCliente, agencia, numeroConta, saldo);
    }
}
