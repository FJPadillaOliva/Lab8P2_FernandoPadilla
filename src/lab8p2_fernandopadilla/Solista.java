
package lab8p2_fernandopadilla;

import java.util.ArrayList;


public class Solista extends Artista {
private int edad;

    public Solista() {
    }

    public Solista(int edad, String usuario, String password, String nombre, String genero, ArrayList<Cancion> lista_canciones) {
        super(usuario, password, nombre, genero, lista_canciones);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
