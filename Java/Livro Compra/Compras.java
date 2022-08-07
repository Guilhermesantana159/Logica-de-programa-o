import java.util.ArrayList;

public class Compras{
    private ArrayList<Livro> lista;
    
    Compras(){
        lista = new ArrayList<>();
    }

    void adicionaLivro(Livro liv){
       if(lista.contains(liv) == false){
           lista.add(liv);
       }
    }
    
    void imprimeListaLivros(){
        for (Livro liv: lista){
            System.out.println(liv);
            System.out.println("=========");
        }
    }
    int busca_livro(Livro liv){
        //É possivel utilizar o return lista.indexof(liv);
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).equals(liv) == true){
                return i;                
            }
        }
        return -1;
    }
    void deleta_livro(Livro liv){
        int i = this.busca_livro(liv);
        if(i>=0){
            lista.remove(i);
            System.out.println("O Livro: " +"\n"+ liv + "\nFoi removido com sucesso!" + "\n");
            System.out.println("=========");
        }else{
            System.out.println("Livro não presente na lista");
        }        
    }           
}
