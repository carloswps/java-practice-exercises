package exercicio2;
import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Digite a opção desejada \n");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consutar Saldo");
            System.out.println("4. Encerrar ");
            int opcao = scanner.nextInt();
            switch (opcao) {
            case 1:
                System.out.println("Digite o valor a ser Depositado \n");
                Double valorDeposito = scanner.nextDouble();
                if (valorDeposito > 0) {
                    saldo += valorDeposito;
                }else {
                    System.out.println("Valor digitado invalido");
                };
                System.out.println("Saldo atual: "+ saldo );
                break;
            case 2:
                System.out.println("Digite o valor solicitado para saque ");
                double valorSaque = scanner.nextDouble();
                if (valorSaque <= saldo) {
                    saldo -= valorSaque;
                    System.out.println("Seu saldo atual é de: "+saldo);
                    
                }else {
                    System.out.println("Valor indisponivel");
                }
                    break;
                case 3:
                System.out.println("O valor atual disponivel é de: " + saldo);
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}