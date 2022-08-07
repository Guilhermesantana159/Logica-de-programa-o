public class TestaCompras{

    public static void main(String[] args){
        
        Compras comp = new Compras();
        //Criação dos livros
        Livro livro_1 = new Livro ("Harry Potter", "J.K.", 800, 20,(float) 2.5);
        Livro livro_2 = new Livro ("A culpa é das Estrelas", "John Green", 100, 7,(float) 1.5);
        Livro livro_3 = new Livro ("Moby Dick", "Herman Melville", 600, 38,(float) 5.5);
        Livro livro_4 = new Livro ("Diário de um banana", "Paulo Sergio", 300, 50,(float) 7.5);
        
        
        comp.adicionaLivro(livro_1);
        comp.adicionaLivro(livro_2);
        comp.adicionaLivro(livro_3);
        comp.adicionaLivro(livro_4);
        //Imprime a lista 
        System.out.println("===============================");
        System.out.println("             Livraria");
        System.out.println("===============================");
        comp.imprimeListaLivros();
        //Utiliza o busca livro para excluir a posição especificada 
        comp.deleta_livro(livro_3);
        //Imprime a lista após deletar o livro Moby Dick
        System.out.println("===============================");
        System.out.println("             Livraria");
        System.out.println("===============================");
        comp.imprimeListaLivros();
    }

}
