public class Livro {
    String nome;
    String descricao;
    private double valor;
    String isbn;
    Autor autor;
    private boolean impresso;


    public Livro(Autor autor) {
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
        this.impresso = true;
    }

    boolean temAutor(){
        return this.autor != null;
    }
    
    void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do livro ");
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if(this.temAutor()) { 
            autor.mostrarDetalhes();
        }
        
        System.out.println("--");
    }

    public boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem > 0.3)
            return false;
        this.valor -= this.valor * porcentagem;
        System.out.println("aplicando desconto no livro...");
        return true;

    }
    
    void adicionaValor(double valor){
        this.valor = valor;
    }
    
    double retornaValor(){
        return this.valor;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;

    //Classe abstrata cap 6
    }
}