
import java.util.Scanner;
public class SalarioDoHeroi {
    public static double calculoSalario(int dt,double ht,double vh){
        return dt * ht * vh;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("      Salário do Herói");
        System.out.println("==============================");
        System.out.println("Bem vindo ao calculador de salário, por favor"
                + " digite o número de heróis que vamos calcular o salário:");
        int qtd = entrada.nextInt();
        String nomes[] = new String[qtd];
        float salario[] = new float[qtd];
        for(int i=0;i<qtd;i++){
            System.out.println("Digite o nome do herói: ");
            String nome = entrada.next();
            System.out.println("Quantas horas ele trabalhou no dia: ");
            double horasTrabalhadas = entrada.nextInt();
            System.out.println("Quantos dias ele trabalhou: ");
            int diasTrabalhados = entrada.nextInt();
            System.out.println("Qual o valor da hora trabalhada: ");
            double valorHora = entrada.nextInt();
            nomes[i] = nome;
            salario[i] = (float) calculoSalario(diasTrabalhados,horasTrabalhadas,valorHora); 
        }
        for(int i=0;i<qtd;i++){
            System.out.println("Nome: " + nomes[i] + "  " + " / Salário: " + salario[i]);
        }
      }
}