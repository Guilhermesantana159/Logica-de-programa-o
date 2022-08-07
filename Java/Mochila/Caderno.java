public class Caderno{
    private int numMaterias;
    private int numFolhas;
    private int idCaderno;
    private double precoCaderno;
    
    Caderno(int numMaterias,int numFolhas,int idCaderno,double precoCaderno){
        this.numMaterias = numMaterias;
        this.numFolhas = numFolhas;
        this.idCaderno = idCaderno;
        this.precoCaderno = precoCaderno; 
    }
    void setnumMaterias (int numMaterias){
        this.numMaterias = numMaterias;
    }
    void setnumFolhas (int numFolhas){
        this.numFolhas = numFolhas;
    }
    void setidCaderno (int idCaderno){
        this.idCaderno = idCaderno;
    }
    void setprecoCaderno (double precoCaderno){
        this.precoCaderno = precoCaderno;
    }
    int getnumMaterias (){
        return this.numMaterias;
    }
    int getnumFolhas(){
        return this.numFolhas;
    }
    int getidCaderno (){
        return this.idCaderno;
    }
    double getprecoCaderno (){
        return this.precoCaderno;
    }
    @Override
    public String toString() {
        return " Caderno{Matérias: " + this.numMaterias + " /Folhas: " + this.numFolhas 
        + " /ID do Caderno: " + this.idCaderno + " /Preço do Caderno: R$ " + this.precoCaderno + "}";
    }
}