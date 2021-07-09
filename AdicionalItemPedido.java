public class AdicionalItemPedido {
    private long id;
    private ItemPedido itemPedido;
    private Adicional adicional;
    private int quantidade;
    private double valorAdicionais;

    public AdicionalItemPedido(){

    }

    public AdicionalItemPedido(long id, ItemPedido itemPedido, Adicional adicional, int quantidade,
            double valorAdicionais) {
        this.id = id;
        this.itemPedido = itemPedido;
        this.adicional = adicional;
        this.quantidade = quantidade;
        this.valorAdicionais = valorAdicionais;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ItemPedido getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(ItemPedido itemPedido) {
        this.itemPedido = itemPedido;
    }

    public Adicional getAdicional() {
        return adicional;
    }

    public void setAdicional(Adicional adicional) {
        this.adicional = adicional;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorAdicionais() {
        return valorAdicionais;
    }

    public void setValorAdicionais(double valorAdicionais) {
        this.valorAdicionais = valorAdicionais;
    }

    @Override
    public String toString() {
        return adicional + ", Quantidade de adicionais:" + quantidade +  ", Valores adicionais:" + valorAdicionais;
    }
    
    
}
