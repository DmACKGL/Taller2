package me.fsanllehi;

public abstract class Universidad {
    private String Nombre;
    private String Apellido;
    private int RUT;
    private boolean Casado;
    private int YOB;

    public Universidad(String nombre, String apellido, int RUT, boolean casado, int YOB) {
        Nombre = nombre;
        Apellido = apellido;
        this.RUT = RUT;
        Casado = casado;
        this.YOB = YOB;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getRUT() {
        return RUT;
    }

    public void setRUT(int RUT) {
        this.RUT = RUT;
    }

    public boolean isCasado() {
        return Casado;
    }

    public void setCasado(boolean casado) {
        Casado = casado;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }
}
