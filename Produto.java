import java.util.ArrayList;

public class Produto {
    private long id;
    private Categoria categoria;
    private int promocao_id;
    private String titulo;
    private String descricao;
    private double valorUnitario;
    private String tempoEntrega;
    private ArrayList<ImagemProduto> imagemProduto = new ArrayList<>();

    public Produto(){

    }

    public Produto(long id, Categoria categoria, int promocao_id, String titulo, String descricao,
            double valorUnitario, String tempoEntrega) {
        this.id = id;
        this.categoria = categoria;
        this.promocao_id = promocao_id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.tempoEntrega = tempoEntrega;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getPromocao_id() {
        return promocao_id;
    }

    public void setPromocao_id(int promocao_id) {
        this.promocao_id = promocao_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getTempoEntrega() {
        return tempoEntrega;
    }

    public void setTempoEntrega(String tempoEntrega) {
        this.tempoEntrega = tempoEntrega;
    }

    
    public void adicionarImagem(ImagemProduto imagem){
        imagemProduto.add(imagem);
    }

    @Override
    public String toString() {
        return  titulo + "\nCódigo: " + id + "\nValor Unitario: " + valorUnitario +  " Reais" + "\nCategoria: " + categoria + descricao +  "\nImagem do Produto:"
                + imagemProduto + "\nID Promocional: " + promocao_id + "\nTempo de entrega: " + tempoEntrega ;
    }
    
    

}    
