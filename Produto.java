package segundoPeriodo.ecommerce_agregacao;

public class Produto {

    static int autoCodigo;

    private int codigo;
    private String descricao;
    private float precoVenda;
    private float aliquotaIcms;
    private boolean vendido = false;



    public Produto(String descricao, float precoVenda, float aliquotaIcms) {
        this.codigo = gerarAutoCodigo();
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.aliquotaIcms = aliquotaIcms;
        this.vendido = vendido;

    }

    public Produto() {
        confirmarVenda();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public boolean isVendido() {
        return vendido;
    }

    public float getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    private int gerarAutoCodigo(){
        return  ++autoCodigo;
    }

    public void calcularIcms(float valor) {
        this.aliquotaIcms = this.precoVenda * valor;
    }

    public void confirmarVenda() {
        this.vendido = true;
    }

    @Override
    public String toString() {
        return "\nProduto: " +
                "codigo=" + codigo +
                ", descricao:" + descricao +
                ", precoVenda: " + precoVenda +
                ", aliquotaIcms: " + aliquotaIcms +
                ", Status: " + vendido +
                '}';
    }
}
