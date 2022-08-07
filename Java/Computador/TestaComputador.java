import java.util.Scanner;
public class TestaComputador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("              Computadores");
        System.out.println("======================================");
        System.out.println("Seja Bem vindo ao laboratório de T.I. Por favor digite o número de computadores que serão feitos: ");
        int numpc = entrada.nextInt();
        String computadores[][] = new String[numpc][4];
        int desconto[] = {10,20,0,0,0};
        double valor[] = new double[numpc];
        for(int i=0;i<numpc;i++){
            System.out.println("Digite o Nome do computador,processador,da placa mãe,da placa de video e o seu preço: ");
            for(int x=0;x<5;x++){
                if(x<=3){
                    computadores[i][x] = entrada.next();
                }else{
                    valor[i] = entrada.nextDouble();
                }
            }
        }
        for(int i=0;i<numpc;i++){
            Computador c1 = new Computador(computadores[i][0],computadores[i][1], computadores[i][2],computadores[i][3],valor[i]);
            System.out.println(c1);          
        }
        System.out.println("Após o Desconto: ");  
        for(int i=0;i<numpc;i++){
            Computador c1 = new Computador(computadores[i][0],computadores[i][1], computadores[i][2],computadores[i][3],valor[i]);
            Computador cds = new Computador(computadores[i][0],computadores[i][1], computadores[i][2],computadores[i][3],c1.aplicadesconto(desconto[i]));
            System.out.println(cds);
        }    
    }     
}

