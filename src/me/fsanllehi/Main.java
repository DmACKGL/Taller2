package me.fsanllehi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\nBienvenido\n\n");
        Util.setup();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("----Menu----\n"+
                    "1) Listar Estudiantes\n" +
                    "2) Listar Profesores\n" +
                    "3) Listar Servicios\n" +
                    "4) Cambiar Seccion (Servicios)\n" +
                    "5) Cambio de departamento\n" +
                    "6) Matricular alumno\n" +
                    "7) Reasignar piso empleado\n" +
                    "8) Cambiar estado civil\n" +
                    "0) Salir\n");
            int seleccion = scan.nextInt();
            if (seleccion == 1) Util.listarEstudiantes();
            if (seleccion == 2) Util.listarProfesores();
            if (seleccion == 3) Util.listarServicios();
            if (seleccion == 4) {
                int contador = 1;
                for (Servicio servicio: Listas.getServicios()) {
                    System.out.printf("ID: %s\n" +
                            "Nombre: %s\n" +
                            "Seccion actual: %s\n", contador, servicio.getNombre(), Listas.getSecciones().get(servicio.getIDS() - 1).getDesc());
                    contador++;
                }
                System.out.println("ID del empleado a cambiar:");
                int id = scan.nextInt();
                for (Seccion seccion: Listas.getSecciones()) {
                    System.out.printf("ID: %s\nDesc: %s\n",seccion.getId(),seccion.getDesc());
                }
                System.out.println("ID Seccion destino:");
                int to = scan.nextInt();
                Listas.getServicios().get(id-1).setIDS(to);
                System.out.println("Se cambio la seccion del empleado");
            }
            if (seleccion == 5) {
                int contador = 1;
                for (Profesor profesor: Listas.getProfesores()) {
                    System.out.printf("ID: %s\n" +
                            "Nombre: %s\n" +
                            "Departamento actual: %s\n", contador, profesor.getNombre(), Listas.getDepartamentos().get(profesor.getIDD() - 1).getNombre());
                    contador++;
                }
                System.out.println("ID del profesor a cambiar:");
                int id = scan.nextInt();
                for (Departameto departamentos: Listas.getDepartamentos()) {
                    System.out.printf("ID: %s\nDesc: %s\n",departamentos.getId(),departamentos.getNombre());
                }
                System.out.println("ID Departamento destino:");
                int to = scan.nextInt();
                Listas.getProfesores().get(id-1).setIDD(to);
                System.out.println("Se cambio el departamento del profesor");
            }
            if (seleccion == 6) {
                System.out.println("Ingrese el nombre del estudiante: ");
                scan.nextLine();
                String nombre = scan.nextLine();
                System.out.println("Ingrese el apellido del estudiante");
                String apellido = scan.nextLine();
                System.out.println("Ingrese el RUT del estudiante (EJ: 204937657");
                int RUT = scan.nextInt();
                System.out.println("¿Esta casado? true = si / false = no");
                boolean casado = scan.nextBoolean();
                System.out.println("Ingrese el año de nacimiento");
                int YOB = scan.nextInt();
                for (Departameto departamentos: Listas.getDepartamentos()) {
                    System.out.printf("ID: %s\nDesc: %s\n",departamentos.getId(),departamentos.getNombre());
                }
                System.out.println("Ingrese id del curso al cual ingresara: ");
                int curso = scan.nextInt();
                Listas.setEstudiantes(new Estudiante(nombre,apellido,RUT,casado,YOB,curso));
            }
            if (seleccion == 7) {
                System.out.println("1) Profesor\n2) Servicios");
                seleccion = scan.nextInt();
                if (seleccion == 1){
                    int contador = 1;
                    for (Profesor profesor: Listas.getProfesores()){
                        System.out.printf("ID: %s\nNombre: %s\nPiso: %s\n", contador, profesor.getNombre(), profesor.getFloor());
                        contador++;
                    }
                    System.out.println("Ingrese ID: ");
                    int id = scan.nextInt();
                    System.out.println("Ingrese piso destino: ");
                    Listas.getProfesores().get(id-1).setFloor(scan.nextInt());
                }
                if (seleccion == 2){
                    int contador = 1;
                    for (Servicio servicio: Listas.getServicios()){
                        System.out.printf("ID: %s\nNombre: %s\nPiso: %s\n", contador, servicio.getNombre(), servicio.getFloor());
                        contador++;
                    }
                    System.out.println("Ingrese ID: ");
                    int id = scan.nextInt();
                    System.out.println("Ingrese piso destino: ");
                    Listas.getServicios().get(id-1).setFloor(scan.nextInt());
                }
            }

            if (seleccion == 8) {
                System.out.println("1) Estudiante\n2) Profesor\n3) Servicios");
                seleccion = scan.nextInt();
                if (seleccion == 1) {
                    int contador = 1;
                    for (Estudiante estudiante: Listas.getEstudiantes()){
                        System.out.printf("ID: %s\nNombre: %s\n¿Casado?: %s\n", contador, estudiante.getNombre(), estudiante.isCasado());
                        contador++;
                    }
                    System.out.println("Ingrese ID: ");
                    int id = scan.nextInt();
                    System.out.println("Ingrese true para si, false para no: ");
                    Listas.getEstudiantes().get(id-1).setCasado(scan.nextBoolean());
                }
                if (seleccion == 2) {
                    int contador = 1;
                    for (Profesor profesor: Listas.getProfesores()){
                        System.out.printf("ID: %s\nNombre: %s\n¿Casado?: %s\n", contador, profesor.getNombre(), profesor.isCasado());
                        contador++;
                    }
                    System.out.println("Ingrese ID: ");
                    int id = scan.nextInt();
                    System.out.println("Ingrese true para si, false para no: ");
                    Listas.getProfesores().get(id-1).setCasado(scan.nextBoolean());
                }
                if (seleccion == 3) {
                    int contador = 1;
                    for (Servicio servicio: Listas.getServicios()){
                        System.out.printf("ID: %s\nNombre: %s\n¿Casado?: %s\n", contador, servicio.getNombre(), servicio.isCasado());
                        contador++;
                    }
                    System.out.println("Ingrese ID: ");
                    int id = scan.nextInt();
                    System.out.println("Ingrese true para si, false para no: ");
                    Listas.getServicios().get(id-1).setCasado(scan.nextBoolean());
                }
            }

            if (seleccion == 0) break;
        }
    }
}
