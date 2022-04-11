package reto.saucedemo.model;

public class CredencialesUser {
    private String usuario;
    private String password;

    public CredencialesUser(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
