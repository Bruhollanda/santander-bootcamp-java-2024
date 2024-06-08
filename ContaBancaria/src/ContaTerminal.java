import java.util.Scanner;

public class ContaTerminal {

    public Conta cadastrar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá!");
        System.out.println("Por favor, informe o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Por favor, informe o número da conta: ");
        int numero = sc.nextInt();

        System.out.println("Por favor, informe a agencia da conta: ");
        int agencia = sc.nextInt();

        System.out.println("Por favor, informe o saldo da conta: ");
        double saldo = sc.nextDouble();

        return new Conta(numero, agencia, nome, saldo);
    }

    public void retorno(Conta conta) {
        System.out.println("Olá, "+conta.getNome()+"!");
        System.out.println("Obrigado por criar uma conta em nosso banco");
        System.out.println("Agencia: "+conta.getAgencia());
        System.out.println("Conta: "+ conta.getNumero());
        System.out.println("Saldo disponível para saque: "+ conta.getSaldo());
    }
}
