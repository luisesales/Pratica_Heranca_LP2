import java.util.ArrayList;

public class Deposito{
    // ArrayList<ProdutoDuravel> PDs;
    // ArrayList<ProdutoNaoDuravel> PnDs;
    Produto pCaro;                    // Produto Mais caro 
    ArrayList<Produto> produtos;


public Deposito(){
    // PDs = new ArrayList<ProdutoDuravel>();
    // PnDs = new ArrayList<ProdutoNaoDuravel>();
    pCaro = new Produto();
    produtos = new ArrayList<Produto>();
}

public void addProduto(Produto p){
    produtos.add(p);
    if(pCaro.getPreco() < p.getPreco()){
        pCaro = new Produto();
        pCaro.setNome(p.getNome());
        pCaro.setPreco(p.getPreco());
        pCaro.setMarca(p.getMarca());
        pCaro.setDescricao(p.getDescricao());
    }
}

public void removeProduto(String nome){
    for(Produto p : produtos){
        if(p.getNome() == nome){
            produtos.remove(p);
        }
    }
}

// public void addProdutoDuravel(ProdutoDuravel PD){
//     PDs.add(PD);
//     if(pCaro.getPreco() < PD.getPreco()){
//         pCaro = new Produto(PD.getNome()
//                            ,PD.getPreco()
//                            ,PD.getMarca()
//                            ,PD.getDescricao());
//     }
// }

// public void addProdutoNaoDuravel(ProdutoNaoDuravel PnD){
//     PnDs.add(PnD);
//     if(pCaro.getPreco() < PD.getPreco()){
//         pCaro = new Produto(PD.getNome()
//                            ,PD.getPreco()
//                            ,PD.getMarca()
//                            ,PD.getDescricao());
//     }
// }

public int getTamanho(){return produtos.size();}

public void isVazio(){
    if(produtos.isEmpty()){
        System.out.println("O Depósito Está Vazio!");
    }
    else System.out.println("O Depósito não Está Vazio!");
}

public void getPcaro(){
    System.out.println("Nome: " + pCaro.getNome());
    System.out.println("Preco: " + pCaro.getPreco());
    System.out.println("Marca: " + pCaro.getMarca());
    System.out.println("Descricao: "+ pCaro.getDescricao());
}

public void list(){
    for(Produto p : produtos){
        System.out.println("Nome: " + p.getNome());
        System.out.println("Preco: " + p.getPreco());
        System.out.println("Marca: " + p.getMarca());
        System.out.println("Descricao: "+ p.getDescricao());
    }
    System.out.println();
    System.out.println("Produto Mais Caro:");
    System.out.println();
    this.getPcaro();
}
}