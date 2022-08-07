public class TestaAquario{    
    public static void main (String [] args){
        Aquario aq = new Aquario();
        
        Peixe p_1  = new Peixe("Tilapia",5);
        Peixe p_2  = new Peixe("Tubarão",300);
        Peixe p_3  = new Peixe("Sardinnha",2);
        Peixe p_4  = new Peixe("Rouballo",10);
        //Repetido
        Peixe p_5  = new Peixe("Rouballo",10);
        
        aq.adiciona_peixe(p_1);
        aq.adiciona_peixe(p_2);
        aq.adiciona_peixe(p_3);
        aq.adiciona_peixe(p_4);
        aq.adiciona_peixe(p_5);
        //Antes de excluir
        System.out.println("========================");
        System.out.println("        Aquario");
        System.out.println("========================");
        aq.imprime_Lista_peixe();
        int pos_peixe = aq.busca_peixe(p_3);
        aq.deleta_peixe(pos_peixe);
        //Depois de excuir
        System.out.println("========================");
        System.out.println("        Aquario");
        System.out.println("========================");
        aq.imprime_Lista_peixe();
           
    }
        
        
        
        
        
        
    }
}