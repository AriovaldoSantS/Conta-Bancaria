import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner conta = new Scanner(System.in);

        System.out.println("Por favor digite seu nome: ");
        String name = conta.nextLine();

        System.out.println("Por favor digite o numero da sua conta: ");
        int number = conta.nextInt();

        System.out.println("Por favor digite sua agencia: ");
        String agencia = conta.next();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = conta.nextDouble();

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + number + " e seu saldo " + saldo + " já está disponível para saque.");

        conta.close();

    }

}
