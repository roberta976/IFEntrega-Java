

public class EnderecoCliente {
    long id;
    Cliente cliente;
    String rua;
    String numero;
    String bairro;
    String cep;
    String cidade;
    String estado;
    String complemento;
    
    public EnderecoCliente(){

    }
    public EnderecoCliente(long id, Cliente cliente, String rua, String numero, String bairro, String cep,
            String cidade, String estado, String complemento) {
        this.id = id;
        this.cliente = cliente;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.complemento = complemento;
    }

    //ACESSO PRIVADO
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    @Override
    public String toString() {
        return "EnderecoCliente [bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", complemento=" + complemento + ", estado=" + estado + ", id=" + id + ", numero=" + numero + ", rua="
                + rua + super.toString() + "]";
    }
    
    
    


    
    
}
