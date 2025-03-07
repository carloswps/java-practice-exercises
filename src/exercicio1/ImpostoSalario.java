package exercicio1;
import java.util.Scanner;

public class ImpostoSalario {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do seu Salario: ");
        float salario = scanner.nextFloat();
        System.out.println("Digite o valor dos seus Beneficios: ");
        float valorBeneficios = scanner.nextFloat();

        float valorImposto = 0;
        if (salario >= 0.00 && salario <= 1100.00) {
            valorImposto = 0.05F * salario;
        }else if (salario >= 1100.01 && salario <= 2500.00) {
            valorImposto = 0.10F * salario;
        }else{
            valorImposto = 0.15F * salario;
        }

        float saida = (salario - valorImposto) + valorBeneficios;
        System.out.println(String.format("%.2f", saida));

        scanner.close();
    }
}
