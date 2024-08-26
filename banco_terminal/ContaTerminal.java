package banco_terminal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TODO: "Conhecer e importar a classe Scanner"
        // Exibir as mensagens para o usuário

        // Obter pela classe scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada

    Scanner scanner = new Scanner((System.in));

        int numeroConta;
        String Agencia , nomeCliente;
        double Saldo;


        System.out.println("Por favor, digite o número da Agência: ");
        Agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo: ");
        Saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + numeroConta + " e seu saldo " + Saldo + " já está disponível para saque");
    }
}
