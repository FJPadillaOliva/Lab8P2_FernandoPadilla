
package lab8p2_fernandopadilla;

import java.util.ArrayList;


public class Artista {
   private String usuario, password, nombre, genero;
   private ArrayList<Cancion> lista_canciones;

    public Artista() {
    super();
    }

    public Artista(String usuario, String password, String nombre, String genero, ArrayList<Cancion> lista_canciones) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.genero = genero;
        this.lista_canciones = lista_canciones;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Cancion> getLista_canciones() {
        return lista_canciones;
    }

    public void setLista_canciones(ArrayList<Cancion> lista_canciones) {
        this.lista_canciones = lista_canciones;
    }

    @Override
    public String toString() {
        return "Artista{" + "usuario=" + usuario + ", password=" + password + ", nombre=" + nombre + ", genero=" + genero + ", lista_canciones=" + lista_canciones + '}';
    }
   
    
   
    
}
