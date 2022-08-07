public class Disquete{
    protected String marca;
    protected String tecArmazenamento;
    protected double capacidade;
    
    Disquete(double capacidade,String tecArmazenamento,String marca){
        this.capacidade = capacidade;
        this.tecArmazenamento = tecArmazenamento;
        this.marca = marca;
    }
    
    Disquete(){
        capacidade = 0;
        tecArmazenamento = null;
        marca = null;
    }
    void setcapacidade (double capacidade){
        this.capacidade = capacidade;
    }
    double getcapacidade (){
        return this.capacidade;
    }
    void settecArmazenamento (String tecArmazenamento){
        this.tecArmazenamento = tecArmazenamento;
    }
    String gettecArmazenamento (){
        return this.tecArmazenamento;
    }
    void setmarca (String marca){
        this.marca = marca;
    }
    String getmarca (){
        return this.marca;
    }
    @Override
    public String toString() {
       return getClass().getName() + "{Marca:" + this.marca + "/Capacidade:" + this.capacidade 
        + "/ Tecnologia de Armazenamento:" + this.tecArmazenamento + "}";
    }
    String armazenar(double valor){
        if(valor <= this.capacidade && valor > 0){
            return "Acessando o " + getClass().getName() + "..." + "\nArmazenar: " + valor + "\nCapacidade: " +
            this.capacidade + "\nCapacidade Restante: " + (this.capacidade - valor)
            + "\nOperação feita com sucesso!!";
        }else{
            return "\nAcessando o " + getClass().getName() + "..."  + "\nArmazenar: " + valor + "\nCapacidade: " +
            this.capacidade + "\nOperação não realizada!!";
        }
    }
}