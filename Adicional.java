

public class Adicional {
    private long id;
    private String titulo;
    private String descricao;
    private double valor;

    public Adicional(){

    }

    public Adicional(long id, String titulo, String descricao, double valor) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return " Adicional: " + titulo + ", Id do adicional: " + id + ", Valor do adicional=" + valor + "]";
    }
    
    
}
