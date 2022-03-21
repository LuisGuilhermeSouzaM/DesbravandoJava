public class RegrasDeDesconto {
    public static void main(String[] args){
        Livro livro = new Livro();
        livro.adicionaValor(59.90);
        System.out.println("Valor atual: " + livro.retornaValor());
        if(!livro.aplicaDescontoDe(0.2)){
            System.out.println("Desconto nao pode ser maior do que 30%");
        } else {
            System.out.println("Valor com desconto: " + livro.retornaValor());
        }
    }
}
