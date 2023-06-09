
package lab8p2_fernandopadilla;

import java.util.ArrayList;


public class Banda extends Artista {
private int num_integrantes;

    public Banda() {
    }

    public Banda(int num_integrantes, String usuario, String password, String nombre, String genero, ArrayList<Cancion> lista_canciones) {
        super(usuario, password, nombre, genero, lista_canciones);
        this.num_integrantes = num_integrantes;
    }

    public int getNum_integrantes() {
        return num_integrantes;
    }

    public void setNum_integrantes(int num_integrantes) {
        this.num_integrantes = num_integrantes;
    }


}
