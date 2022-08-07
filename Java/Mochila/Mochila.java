public class Mochila{
    private double preçoMochila;
    private Caderno caderno;
    private Estojo estojo;
    
    Mochila(double preçoMochila,Caderno caderno,Estojo estojo){
        this.preçoMochila = preçoMochila;
        this.caderno = caderno;
        this.estojo = estojo;
    }
    void setpreçoMochila (double preçoMochila){
        this.preçoMochila = preçoMochila;
    }
    double getpreçoMochila (){
        return this.preçoMochila;
    }
    @Override
    public String toString() {
        return this.caderno + "\n" + this.estojo + "\n MochilaPreço da Mochila: R$" + this.preçoMochila + "\n Preço total dos Componentes: R$" 
        + (estojo.getpreçoEstojo() + caderno.getprecoCaderno() + this.preçoMochila);
    }
}