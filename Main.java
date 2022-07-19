package Conceptos_Basicos.ejercicios.Tema5_E4;

public class Main {
    public static void main(String[] args) {

        SmartDevice samsung = new SmartPhone(true,299.9,"Samsung","S1",true,true);

        System.out.println("Características Samsung " + samsung);

        SmartDevice iWatch = new SmartWatch(true,178.9,"Apple","i10",true,true);

        System.out.println("Características iWatch " + iWatch);


    }
}
