public class ProdutoDuravel extends Produto{
    private int durabilidade;

    public void setDurabilidade(int d){
        if(d >= 0){durabilidade = d;}
        else System.out.println("Insira uma Durabilidade Válida!");
    }
    public int getDurabilidade(){return durabilidade;}

    public void setNome(String n){super.setNome(n);}
    public String getNome(){return super.getNome();}

    public void setPreco(double p){super.setPreco(p);}
    public double getPreco(){return super.getPreco();}

    public void setMarca(String m){super.setMarca(m);}
    public String getMarca(){return super.getMarca();}

    public void setDescricao(String d){super.setDescricao(d);}
    public String getDescricao(){return super.getDescricao();}
}