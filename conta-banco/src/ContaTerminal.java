//TODO:Conhecer e importar a classe Scanner
import java.util.Scanner;

      //Exibir as mensagens para o nosso usuário
public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

          //Obter pela scanner os valores digitados no terminal

          public static void main(String[] args) {
            ContaTerminal conta = new ContaTerminal();
        }      
    public ContaTerminal() {
        Scanner scanner = new Scanner(System.in);
    

        System.out.println("Por favor, digite o número da conta!");
        this.numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência!");
        scanner.nextLine();  // Consumir a quebra de linha
        this.agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        this.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial!");
        this.saldo = scanner.nextDouble();
//Exibir a mensagem conta criada 

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
    
}

