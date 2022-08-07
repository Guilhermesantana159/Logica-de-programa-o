import java.util.Scanner; 
public class Testa{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("          Armazenamentos       ");
        System.out.println("===================================");
        System.out.println("Bem vindo ao armazenador,Deseja armazenar em "
                + "qual dispositvo de armazenamento: PenDrive [1] ou Disquete [2]");
        int tipo = entrada.nextInt();
        if(tipo == 1){
            System.out.println("Digite a marca do pendrive");
            String marca = entrada.next();
            System.out.println("Digite a capacidade de armazenamento do pendrive");
            double capacidade = entrada.nextDouble();
            System.out.println("Digite a tecnologia de armazenamento do pendrive");
            String tecnologia = entrada.next();
            PenDrive p = new PenDrive(capacidade,tecnologia,marca);
            System.out.println(p);
            System.out.println("=================================");
            System.out.println("Digite o valor a ser armazenado");
            double valor = entrada.nextDouble();
            System.out.println(p.armazenar(valor));            
        }else if(tipo == 2){
            System.out.println("Digite a marca do disquete");
            String marca = entrada.next();
            System.out.println("Digite a capacidade de armazenamento do disquete");
            double capacidade = entrada.nextDouble();
            System.out.println("Digite a tecnologia de armazenamento do disquete");
            String tecnologia = entrada.next();
            Disquete d = new Disquete(capacidade,tecnologia,marca);
            System.out.println(d);
            System.out.println("===================================");
            System.out.println("Digite o valor a ser armazenado");
            double valor = entrada.nextDouble();
            System.out.println(d.armazenar(valor)); 
        }else{
            System.out.println("Número incompatível com a resposta");
        }
        
    }
}