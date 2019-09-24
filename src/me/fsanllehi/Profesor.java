package me.fsanllehi;

public class Profesor extends Universidad {
    private int Floor;
    private int IDD;
    private int IDT;
    private int YOI;

    public Profesor(String nombre, String apellido, int RUT, boolean casado, int YOB, int floor, int IDD, int IDT, int YOI) {
        super(nombre, apellido, RUT, casado, YOB);
        Floor = floor;
        this.IDD = IDD;
        this.IDT = IDT;
        this.YOI = YOI;
    }

    public int getFloor() {
        return Floor;
    }

    public void setFloor(int floor) {
        Floor = floor;
    }

    public int getIDD() {
        return IDD;
    }

    public void setIDD(int IDD) {
        this.IDD = IDD;
    }

    public int getIDT() {
        return IDT;
    }

    public void setIDT(int IDT) {
        this.IDT = IDT;
    }

    public int getYOI() {
        return YOI;
    }

    public void setYOI(int YOI) {
        this.YOI = YOI;
    }
}
