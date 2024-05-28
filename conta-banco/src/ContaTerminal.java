import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Inicializa as variáveis que serão utilizadas durante o projeto.
        int numero;
        String agencia, nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Mensagem de boas vindas e primeira inserção de informações via Scanner
        System.out.println("Olá! Seja bem-vindo ao sistema de cadastro do banco <sample text>.");
        System.out.println("Para iniciar o processo do seu cadastro, insira o seu nome completo:");
        nomeCliente = scanner.nextLine();

        System.out.println("\nAgora, digite o número da sua agência e o dígito final (exemplo: 067-8): ");
        agencia = scanner.next();

        System.out.println("\nDigite o número da sua conta:");
        numero = scanner.nextInt();

        System.out.println("\nInsira qual o valor do seu primeiro depósito:");
        saldo = scanner.nextDouble();

        System.out.println("Parabéns, " + nomeCliente + "!\nObrigado por criar uma conta em nosso banco." +
                            "\nO número da sua agência é: " + agencia + "." + "\nO número da sua conta é: " + numero + "." +
                            "\nSeu saldo de " + saldo + " já está disponível para saque");

    }
}
