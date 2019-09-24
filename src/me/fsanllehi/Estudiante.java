package me.fsanllehi;

public class Estudiante extends Universidad {
    private int IDD;

    public Estudiante(String nombre, String apellido, int RUT, boolean casado, int YOB, int IDD) {
        super(nombre, apellido, RUT, casado, YOB);
        this.IDD = IDD;
    }

    public int getIDD() {
        return IDD;
    }

    public void setIDD(int IDD) {
        this.IDD = IDD;
    }
}
