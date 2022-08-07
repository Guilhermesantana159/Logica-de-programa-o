public class Estojo{
    private int qtdMateriais;
    private double preçoEstojo;
    private int idEstojo;
  
    
    Estojo(int qtdMateriais,int idEstojo,double preçoEstojo){
        this.qtdMateriais = qtdMateriais;
        this.idEstojo = idEstojo;
        this.preçoEstojo = preçoEstojo;
    }
    void setqtdMateriais (int qtdMateriais){
        this.qtdMateriais = qtdMateriais;
    }
    void setidEstojo (int idEstojo){
        this.idEstojo = idEstojo;
    }
    void setpreçoEstojo (double preçoEstojo){
        this.preçoEstojo = preçoEstojo;
    }
    int getqtdMateriais (){
        return this.qtdMateriais;
    }
    int getidEstojo(){
        return this.idEstojo;
    }
    double getpreçoEstojo (){
        return this.preçoEstojo;
    }
    @Override
    public String toString() {
        return " Estojo{QTD de Materiais: " + this.qtdMateriais + " /ID do estojo: " + this.idEstojo 
        + " /Preço do Estojo: R$" + this.preçoEstojo + "}";
    }

}