package me.fsanllehi;

public class Main {

    public static void main(String[] args) {
        Util.setup();
        System.out.println("Profesores");
        for (Profesor profesor: Listas.getProfesores()) {
            System.out.println("===========================");
            System.out.println("Nombre: "+profesor.getNombre());
            System.out.println("Apellido: "+profesor.getApellido());
            System.out.println("RUT: "+profesor.getRUT());
            System.out.println("¿Casado?: "+profesor.isCasado());
            System.out.println("Año nacimiento: "+profesor.getYOB());
            System.out.println("Edad: "+Util.CalcEdad(profesor.getYOB()));
            System.out.println("Departamento: "+ Listas.getDepartamentos().get(profesor.getIDD()-1).getNombre());

        }
    }
}
