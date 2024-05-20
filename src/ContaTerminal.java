import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner conta = new Scanner(System.in);

        
        System.out.println("Por favor, digite seu nome: ");
        String nome = conta.nextLine();

        
        System.out.println("Por favor, digite o número da sua conta: ");
        int numero = conta.nextInt();

        
        System.out.println("Por favor, digite sua agência: ");
        conta.nextLine(); // Limpa o buffer
        String agencia = conta.nextLine();

        
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = conta.nextDouble();

        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        
        conta.close();
    }
}
