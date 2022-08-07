import java.util.ArrayList;
public class Aquario {
     private ArrayList<Peixe> lista;
     
    Aquario(){
        lista = new ArrayList<>();
    }

    void adiciona_peixe(Peixe p){
       if(lista.contains(p) == false){
           lista.add(p);
       }
    }
    
    void imprime_Lista_peixe(){
        for (Peixe p: lista){
            System.out.println(p);
            System.out.println("=========");
        }
    }
    int busca_peixe(Peixe p){
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).equals(p) == true){
                return i;                
            }
        }
        return -1;
    }
    void deleta_peixe(int indice_peixe){
        if(indice_peixe>=0){
            System.out.println("O Peixe " + lista.get(indice_peixe).getespecie()  + " foi removido com sucesso!");
            lista.remove(indice_peixe);
            System.out.println("=========");
        }else{
            System.out.println("Peixe não presente na lista");
        }        
    }           

   
}