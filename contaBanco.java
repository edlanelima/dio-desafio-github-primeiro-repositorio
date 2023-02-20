import java.util.Scanner;

public class ContaTerminal {

    //https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.print("Número da conta: ");
        numero = sc.nextInt();

        System.out.print("Agência da conta: ");
        agencia= sc.next();

        System.out.print("Nome do cliente: ");
        sc.next();
        nomeCliente= sc.nextLine();

        System.out.print("Valor do saldo: ");
        saldo = sc.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero,
                saldo);
    }
}
