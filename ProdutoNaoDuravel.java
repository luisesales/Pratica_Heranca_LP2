import java.util.Date;
public class ProdutoNaoDuravel extends Produto{
    private Date dataValidade;
    private String genero;

    public void setDataValidade(Date data){
        if(data > LocalDateTime.now()){
            dataValidade = data;
        }
        else System.out.println("Insira uma Data Válida!");
    }
    public Date getDataValidade(){return dataValidade;}

    public void setGenero(String g){genero = g;}
    public String getGenero(){return genero;}

    public void setNome(String n){super.setNome(n);}
    public String getNome(){return super.getNome();}

    public void setPreco(double p){super.setPreco(p);}
    public double getPreco(){return super.getPreco();}

    public void setMarca(String m){super.setMarca(m);}
    public String getMarca(){return super.getMarca();}

    public void setDescricao(String d){super.setDescricao(d);}
    public String getDescricao(){return super.getDescricao();}
}