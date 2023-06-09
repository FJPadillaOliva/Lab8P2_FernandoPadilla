
package lab8p2_fernandopadilla;

import java.util.ArrayList;


public class Usuario {
  private String usuario, password, nombre;
  private int edad;
  private ArrayList<Evento> lista_eventos;
  private ArrayList<Artista> lista_seguidos;

    public Usuario() {
    }

    public Usuario(String usuario, String password, String nombre, int edad, ArrayList<Evento> lista_eventos, ArrayList<Artista> lista_seguidos) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.edad = edad;
        this.lista_eventos = lista_eventos;
        this.lista_seguidos = lista_seguidos;
    }

    public Usuario(String usuario, String password, String nombre, int edad) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Evento> getLista_eventos() {
        return lista_eventos;
    }

    public void setLista_eventos(ArrayList<Evento> lista_eventos) {
        this.lista_eventos = lista_eventos;
    }

    public ArrayList<Artista> getLista_seguidos() {
        return lista_seguidos;
    }

    public void setLista_seguidos(ArrayList<Artista> lista_seguidos) {
        this.lista_seguidos = lista_seguidos;
    }

    @Override
    public String toString() {
        return  "Usuario=" + usuario; 
    }
  
  
}
