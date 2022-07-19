package Conceptos_Basicos.ejercicios.Tema5_E4;

public class SmartPhone extends SmartDevice {


    boolean android;
    boolean camara;

    public SmartPhone() {
    }

    public SmartPhone(boolean bateria, double precio, String fabricante, String modelo, boolean android, boolean camara) {
        super(bateria, precio, fabricante, modelo);
        this.android = android;
        this.camara = camara;
    }


    @Override
    public String toString() {
        return "SmartPhone {" +
                "android=" + android +
                ", camara=" + camara +
                ", bateria=" + bateria +
                ", precio=" + precio +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
