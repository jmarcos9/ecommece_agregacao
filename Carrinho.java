package segundoPeriodo.ecommerce_agregacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Carrinho {

    private int id;
    private Date data;
    private int numDeItens;
    static public List<Produto> listaProdutos = new ArrayList<Produto>();
    private float valorIcms;
    private float valorVenda;
    private String status;

    public Carrinho(int id, Date data,List<Produto> numItens) {
        this.id = id;
        this.data = data;
        this.numDeItens = numItens.size();
        this.valorIcms = calculaTotalIcms();
        this.valorVenda = calculaTotalVenda();
        this.status = status;
    }

    public Carrinho(int id, Date data, float valorIcms, float valorVenda, String status, float valorTotal) {
        this.id = id;
        this.data = data;
        this.numDeItens = numDeItens;
        this.valorIcms = valorIcms;
        this.valorVenda = valorVenda;
        this.status = status;
    }

    public Carrinho() {

    }

    public static ArrayList<Produto> getListaProdutos() {
        return (ArrayList<Produto>) listaProdutos;
    }

    public int getId() {
        return id;
    }


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getNumDeItens() {
        return numDeItens;
    }

    public float getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(float valorIcms) {
        this.valorIcms = valorIcms;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    static public void inserirItem(Produto produto){
        listaProdutos.add(produto);
    }

    static float calculaTotalIcms(){
        float totalIcms = 0;
        for (Produto p: listaProdutos) {
            totalIcms += p.getAliquotaIcms();
        }
        return totalIcms;
    }

    static float calculaTotalVenda(){
        float totalVenda = 0;
        for (Produto p: listaProdutos) {
            totalVenda += p.getPrecoVenda();
        }
        return totalVenda;
    }

    @Override
    public String toString() {
        String s = "Carrinho{" +
                "id=" + id +
                ", data=" + data +
                ", numDeItens=" + numDeItens +
                ", valorVenda=" + valorVenda +
                ", valorIcms=" + valorIcms +
                ", status='" + status + '\'' +
                ", valorTotal=" + (this.valorIcms + this.valorVenda) +
                '}';
        return s;
        }

    //relaorio, fluxo, cadastro

}
