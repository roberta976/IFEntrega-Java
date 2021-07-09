public class ImagemProduto {
    private long id;
    private Produto produto;
    private String titulo;

    public ImagemProduto(){

    }
    
    public ImagemProduto(long id, Produto produto, String titulo) {
        this.id = id;
        this.produto = produto;
        this.titulo = titulo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Id: " + id + ",  Título:" + titulo;
    }
    
}
