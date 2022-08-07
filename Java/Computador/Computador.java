public class Computador {
    String nomeComputador;
    String processador;
    String placaMae;
    String placaDeVideo;
    double preco;
    
    Computador(String nome,String processador,String placaMãe,String placaVideo, double preco){
        this.nomeComputador = nome;
        this.processador = processador;
        this.placaMae = placaMãe;
        this.placaDeVideo = placaVideo;
        this.preco = preco;
    }  
    @Override
    public String toString() {
        return "Nome do Computador: " + this.nomeComputador + " Processador: " + this.processador 
        + " Placa Mãe: " + this.placaMae + " Placa de Video: " + this.placaDeVideo + " Preço: " + this.preco;
    }
    public double aplicadesconto(int porcentagem){
       return this.preco = this.preco - porcentagem* this.preco/100;
    }
}
