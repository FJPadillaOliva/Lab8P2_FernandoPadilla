
package lab8p2_fernandopadilla;


public class Evento {
private String fecha, ciudad, lugar;
private int capacidad;

    public Evento() {
    }

    public Evento(String fecha, String ciudad, String lugar, int capacidad) {
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.capacidad = capacidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Evento{" + "fecha=" + fecha + ", ciudad=" + ciudad + ", lugar=" + lugar + ", capacidad=" + capacidad + '}';
    }


}
