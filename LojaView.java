import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class LojaView{
    public static void main(String args[]) throws ParseException{
        ProdutoDuravel carro,livro,celular;
        ProdutoNaoDuravel chocolate,toalha,sabonete;
        Deposito dep = new Deposito();
        String data = "00-00-0000";
        Date dt = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		dt = formato.parse(data);

        carro.setNome("Palio");
        carro.setPreco(30000);
        carro.setMarca("Fiat");
        carro.descricao("Carro Branco");
        carro.setDurabilidade(20);
        dep.addProduto(carro);

        livro.setNome("O Príncipe");
        livro.setPreco(20);
        livro.setMarca("-");
        livro.setDescricao("Livro escrito por Nicolau Maquiavel");
        livro.setDurabilidade(10);
        dep.addProduto(livro);

        celular.setNome("Redmi Note 10");
        celular.setPreco(1500);
        celular.setMarca("Xiaomi");
        celular.setDescricao("Celular para todas as ocasiões");
        celular.setDurabilidade(5);
        dep.addProduto(celular);

        chocolate.setNome("Ao leite");
        chocolate.setPreco(10);
        chocolate.setMarca("Diamante Negro");
        chocolate.setDescricao("Chocolate feito ao leite");
        chocolate.setGenero("Alimentício");
        chocolate.setDataValidade("01/01/2024");
        dep.addProduto(chocolate);

        toalha.setNome("Phillips auto toalha");
        toalha.setPreco(7.5);
        toalha.setMarca("Phillips");
        toalha.setDescricao("Toalha incrível que se seca sozinha");
        toalha.setGenero("Higiene Pessoal");
        toalha.setDataValidade("01/01/2024");
        dep.addProduto(toalha);
    }
}