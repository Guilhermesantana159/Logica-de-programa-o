import java.util.ArrayList;
public class Agenda {
     private ArrayList<Compromisso> lista;
     
    Agenda(){
        lista = new ArrayList<>();
    }

    void adiciona_compromisso(Compromisso comp){
       if(lista.size() == 0 || this.busca_compromisso(comp)== -1){
           lista.add(comp);
       }
    }
    
    void imprime_Lista_compromisso(){
        for (Compromisso comp: lista){
            System.out.println(comp);   
            System.out.println("=========");
        }
    }
    int busca_compromisso(Compromisso comp){
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getHorario().equals(comp.getHorario()) == true){
                return i;                
            }
        }
        return -1;
    }
}