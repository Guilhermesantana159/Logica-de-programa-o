public class PenDrive extends Disquete{
    PenDrive(double capacidade,String tecArmazenamento,String marca){
        super(capacidade,tecArmazenamento,marca);
    }
    PenDrive(){
        capacidade = 0;
        tecArmazenamento = null;
        marca = null;
    }
     void setcapacidade (double capacidade){
        super.capacidade = capacidade;
    }
    double getcapacidade (){
        return super.capacidade;
    }
    void settecArmazenamento (String tecArmazenamento){
        super.tecArmazenamento = tecArmazenamento;
    }
    String gettecArmazenamento (){
        return super.tecArmazenamento;
    }
    void setmarca (String marca){
        super.marca = marca;
    }
    String getmarca (){
        return super.marca;
    }
    @Override
    public String toString() {
       return super.toString();
    }
    String armazenar(double valor){
        return super.armazenar(valor);
    }
}