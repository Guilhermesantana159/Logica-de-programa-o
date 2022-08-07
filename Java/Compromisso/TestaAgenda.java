import java.util.Scanner;
public class TestaAgenda {
    
    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);
        Agenda Ag = new Agenda();
        String resp;
        do{
            System.out.println("======================================");
            System.out.println("               Agenda");
            System.out.println("======================================");
            System.out.println("Seja bem vindo a sua agenda,Por Favor selecione o que deseja fazer na agenda");
            System.out.println("[1] Adicionar compromisso [2] Buscar compromisso [3]  Imrpimir a lista de compromisso ");
            int opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Descreva a descrição do compromisso");
                    String desc = entrada.next();
                    System.out.println("Insira Agora o Horario: Hora/Minuto");
                    int hora = entrada.nextInt();
                    int min = entrada.nextInt();
                    Compromisso comp = new Compromisso(desc,hora,min);
                    Ag.adiciona_compromisso(comp);
                    break;
                case 2:                    
                    System.out.println("Insira o horario para buscar um comprimisso: Hora/minuto");
                    int hora_ver = entrada.nextInt();
                    int min_ver = entrada.nextInt();
                    Compromisso comp_verificação = new Compromisso(" ",hora_ver,min_ver);
                    int pos = Ag.busca_compromisso(comp_verificação);
                    if(pos >= 0){
                        System.out.println("O compromisso esta na posição " + pos + " da lista" );
                    }else{
                        System.out.println("Este Compromisso não existe");
                    } 
                    break;
                case 3:
                    Ag.imprime_Lista_compromisso();
                    break;
                default:
                    System.out.println("Digito incorreto");
                    break;
            } 
            System.out.println("Deseja realizar outra operação? [s] ou [n]");
            resp = entrada.next();
        }
        while("s".equals(resp));
    }
}