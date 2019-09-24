package me.fsanllehi;

import java.util.ArrayList;

public class Listas {
    private static ArrayList<Estudiante> Estudiantes = new ArrayList<>();
    private static ArrayList<Profesor> Profesores = new ArrayList<>();
    private static ArrayList<Servicio> Servicios = new ArrayList<>();
    private static ArrayList<Departameto> Departamentos = new ArrayList<>();
    private static ArrayList<Contrato> Contratos = new ArrayList<>();
    private static ArrayList<Seccion> Secciones = new ArrayList<>();

    public static ArrayList<Estudiante> getEstudiantes() {
        return Estudiantes;
    }

    public static void setEstudiantes(Estudiante estudiantes) {
        Estudiantes.add(estudiantes);
    }

    public static ArrayList<Profesor> getProfesores() {
        return Profesores;
    }

    public static void setProfesores(Profesor profesores) {
        Profesores.add(profesores);
    }

    public static ArrayList<Servicio> getServicios() {
        return Servicios;
    }

    public static void setServicios(Servicio servicios) {
        Servicios.add(servicios);
    }

    public static ArrayList<Departameto> getDepartamentos() {
        return Departamentos;
    }

    public static void setDepartamentos(Departameto departamento) {
        Departamentos.add(departamento);
    }

    public static ArrayList<Contrato> getContratos() {
        return Contratos;
    }

    public static void setContratos(Contrato contrato) {
        Contratos.add(contrato);
    }

    public static ArrayList<Seccion> getSecciones() {
        return Secciones;
    }

    public static void setSecciones(Seccion secciones) {
        Secciones.add(secciones);
    }
}
