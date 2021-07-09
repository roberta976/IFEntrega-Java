
public class Usuario {
    //atributos
	private long id;
    private String username;
    private String password;
    private boolean enabled;

    public Usuario(){

    }
    public Usuario(long id, String username, String password, boolean enabled) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    @Override
    public String toString() {
        return "Usuario [enabled=" + enabled + ", id=" + id + ", password=" + password + ", username=" + username + "]";
    }

    
}