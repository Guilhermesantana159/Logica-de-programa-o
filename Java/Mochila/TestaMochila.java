public class TestaMochila{
    public static void main (String [] args){
        Caderno c = new Caderno(30,50,70,80);
        Estojo e = new Estojo(10,10,10); 
        Mochila m = new Mochila(100,c,e);
        System.out.println("=======================================");
        System.out.println("               Mochila");
        System.out.println("=======================================");
        System.out.println(m);
    }
}