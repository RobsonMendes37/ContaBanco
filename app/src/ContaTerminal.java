import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero ;
        String agencia;
        String nomeCliente;
        double saldo = 77.7;


        System.out.println("Bem vindo ao Banco Bradesco ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("insira com o valor: ");
        numero = scanner.nextInt();
        System.out.print("insira com a agencia: ");
        agencia = scanner.next();
        System.out.print("insira com o nome do cliente: ");
        nomeCliente = scanner.next();
        System.out.print("insira com o saldo: ");
        saldo = scanner.nextDouble();

        System.out.print("Olá "+ nomeCliente+ " obrigado por criar uma conta em nosso banco, sua agência é "+agencia+ ", conta numero "+numero+ "e seu saldo de "+saldo+ " já está disponível para saque, aproveite.");
    }
}
