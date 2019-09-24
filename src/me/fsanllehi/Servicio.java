package me.fsanllehi;

public class Servicio extends Universidad {
    private int Floor;
    private int IDS;
    private int YOI;

    public Servicio(String nombre, String apellido, int RUT, boolean casado, int YOB, int floor, int IDS, int YOI) {
        super(nombre, apellido, RUT, casado, YOB);
        Floor = floor;
        this.IDS = IDS;
        this.YOI = YOI;
    }

    public int getFloor() {
        return Floor;
    }

    public void setFloor(int floor) {
        Floor = floor;
    }

    public int getIDS() {
        return IDS;
    }

    public void setIDS(int IDS) {
        this.IDS = IDS;
    }

    public int getYOI() {
        return YOI;
    }

    public void setYOI(int YOI) {
        this.YOI = YOI;
    }
}
