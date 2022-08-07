public class Livro{
    //atributos
    private String titulo;
    private String autor;
    private int nPaginas, qtCapitulos;
    private float custoPagina;
    
    
    Livro(String t, String a, int np, int qtc, float cpag){
        this.titulo = t;
        this.autor = a;
        //this.nPaginas = np;
        setNPaginas(np);
        this.qtCapitulos = qtc;
        this.custoPagina = cpag;
    }
    
    void setNPaginas(int np){
       if (np >= 0)
            this.nPaginas = np;
       else
            this.nPaginas = 0;
    }
    
    double calculaPrecoCusto(){
        return this.nPaginas * this.custoPagina;
    }

    //preço de venda é de 12% a mais do que o preço de custo
    double calculaPrecoVenda(){
        return calculaPrecoCusto() * 1.12;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro liv = (Livro) o;
        return this.titulo.equals(liv.titulo) && this.autor.equals(liv.autor) && this.nPaginas == liv.nPaginas && this.qtCapitulos == liv.qtCapitulos;
    }
    @Override
    public String toString(){
        return "Título: "+ this.titulo + "\nAutor: "+ this.autor + "\nPáginas: "+ this.nPaginas + "\nCapítulos: "+ this.qtCapitulos + "\nPreço venda: " + this.calculaPrecoVenda();
    }
    

}
