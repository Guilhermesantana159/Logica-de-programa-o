public class Peixe {
    private String especie;
    private double comprimento;
    
    Peixe(String especie, int comprimento){
        this.especie = especie;
        this.comprimento = comprimento;
    }
    
    void setespecie (String especie){
        this.especie = especie;
    }
    String getespecie (){
        return this.especie;
    }
    
    void setcomprimento (double comp){
        this.comprimento = comprimento;
    }
    double getcomprimento (){
        return this.comprimento;
    }
    
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Peixe)) return false;
        Peixe p = (Peixe) obj;
        return this.especie.equals(p.especie) && this.comprimento == p.comprimento;
    }
    @Override
    public String toString(){
        return "Especie: "+ this.especie + "\nComprimento: "+ this.comprimento;
    }

}