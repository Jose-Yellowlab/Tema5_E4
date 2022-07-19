package Conceptos_Basicos.ejercicios.Tema5_E4;

public class SmartWatch extends SmartDevice {

    boolean llamadas;
    boolean pulsaciones;


    public SmartWatch() {
    }

    public SmartWatch(boolean bateria, double precio, String fabricante, String modelo, boolean llamadas, boolean pulsaciones) {
        super(bateria, precio, fabricante, modelo);
        this.llamadas = llamadas;
        this.pulsaciones = pulsaciones;
    }

    @Override
    public String toString() {
        return "SmartWatch {" +
                "llamadas=" + llamadas +
                ", pulsaciones=" + pulsaciones +
                ", bateria=" + bateria +
                ", precio=" + precio +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
