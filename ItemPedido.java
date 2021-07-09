import java.util.ArrayList;

public class ItemPedido {
    private long id;
    private Pedido pedido;
    private Produto produto;
    private int quantidade;
    private double valorTotal;
    private String observacao;
    private ArrayList<AdicionalItemPedido> adicionalItemPedido = new ArrayList<>();
    

    public ItemPedido(){

    }

    public ItemPedido(long id, Pedido pedido, Produto produto, int quantidade, double valorTotal, String observacao) {
        this.id = id;
        this.pedido = pedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.observacao = observacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void adicionarAdiconalPedido(AdicionalItemPedido adicional){
        adicionalItemPedido.add(adicional);
    }

    @Override
    public String toString() {
        return  "\nProduto: " + produto +"\nAdicional do pedido: " + adicionalItemPedido + "\nObservação: " + observacao
                +  "\nQuantidade: " + quantidade + pedido +"\nValor + Adicionais:"
                 + valorTotal + " Reais";
    }
    
    
    
}

