package starter.models;

import io.cucumber.java.it.Data;


public class DatosCredenciales {
    private String usuario;
    private String password;

    public DatosCredenciales(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
