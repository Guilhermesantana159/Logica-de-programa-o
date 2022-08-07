public class Animal {
    private double peso;
    private String especie;
    private double altura;
    private double largura;
    private String cor;
    
    void setPeso (double peso){
        this.peso = peso;
    }
    void setEspecie (String especie){
        this.especie = especie;
    }
    void setAltura (double altura){
        this.altura = altura;
    }
    void setLargura (double largura){
        this.largura = largura;
    }
    void setCor (String cor){
        this.cor = cor;
    }            
    double getPeso (){
        return this.peso;
    }
    String getEspecie  (){
        return this.especie;
    }
    double getAltura (){
        return this.altura;
    }
    double getLargura (){
        return this.largura;
    }
    String getCor (){
        return this.cor;
    }
  
    
    @Override
    public boolean equals(Object o){
        if(o == this) return true;
        if(!(o instanceof Animal)) return false;
        Animal a = (Animal) o;
        return a.peso == this.peso && a.especie == this.especie && a.altura == this.altura && a.largura == this.largura && a.cor == this.cor;
    }
    @Override
    public String toString() {
        return "Especie: " + this.especie + " \nPeso: " + this.peso +
        " \nAltura " + this.altura + " \nLargura: " + this.largura + " \nCor: " 
        + this.cor;
    }
}
