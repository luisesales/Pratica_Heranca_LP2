public class Produto{
    private String nome;
    private double preco;
    private String marca;
    private String descricao;

    public Produto(String n, double p, String m, String d){
        this.setNome(n);
        this.setPreco(p);
        this.setMarca(m);
        this.setDescricao(d);
    }

    public void setNome(String n){nome = n;}
    public String getNome(){return nome;}

    public void setPreco(double p){
        if(p > 0){ 
            preco = p;
        }
        else System.out.println("Insira um Preço Válido!");
    }
    public double getPreco(){return preco;}

    public void setMarca(String m){marca = m;}
    public String getMarca(){return marca;}

    public void setDescricao(String d){descricao = d;}
    public String getDescricao(){return descricao;}
}