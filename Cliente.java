import java.util.ArrayList;

public class Cliente extends EnderecoCliente{
	private long id;
	private Usuario usuario;
	private ArrayList<EnderecoCliente> enderecoPadrao = new ArrayList<>();
	private String nome;
	private String cpf;
	private String fone;
	private String foneAlternativo;
	
	public Cliente() {
		
	}
	public Cliente(long id, Usuario usuario,  String nome, String cpf, String fone, String foneAlternativo) {
		this.id = id;
		this.usuario = usuario;
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
		this.foneAlternativo = foneAlternativo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getFoneAlternativo() {
		return foneAlternativo;
	}
	public void setFoneAlternativo(String foneAlternativo) {
		this.foneAlternativo = foneAlternativo;
	}
	public void adicionarEndereco(EnderecoCliente endereco){
        enderecoPadrao.add(endereco);
    }
	@Override
	public String toString() {
		return "Cliente [cpf=" + this.cpf + ", enderecoPadrao=" + this.enderecoPadrao + ", fone=" + this.fone + ", foneAlternativo="
			+ this.foneAlternativo + ", id=" + this.id + ", nome=" + this.nome + ", usuario=" + this.usuario + "]";

	}

	
	
}
