package me.fsanllehi;

class Util {
    static void setup(){
        //Popular lista departamentos
        System.out.println("Populando lista departamentos...");
        Listas.setDepartamentos(new Departameto(1, "Lenguaje"));
        Listas.setDepartamentos(new Departameto(2, "Matematicas"));
        Listas.setDepartamentos(new Departameto(3, "Arquitectura"));

        System.out.println("Populando lista de contratos...");
        Listas.setContratos(new Contrato(1, "Jornada completa"));
        Listas.setContratos(new Contrato(2, "Anexo"));
        Listas.setContratos(new Contrato(3, "Adjunto"));

        System.out.println("Populando lista de secciones servicios...");
        Listas.setSecciones(new Seccion(1,"Biblioteca"));
        Listas.setSecciones(new Seccion(2,"Decanato"));
        Listas.setSecciones(new Seccion(3,"Secretaria"));
        Listas.setSecciones(new Seccion(4,"Cafeteria"));

        System.out.println("Populando lista de estudiantes...");
        Listas.setEstudiantes(new Estudiante("Juan","Perez", 204836665,false,2000,1));
        Listas.setEstudiantes(new Estudiante("Roberta", "Sarabia", 199908808, false, 2005, 2));
        Listas.setEstudiantes(new Estudiante("Marcelo", "Rios", 182304699, true, 1990,3));
        Listas.setEstudiantes(new Estudiante("Juana", "Arcos", 198803195,false,2000,2));
        Listas.setEstudiantes(new Estudiante("Raul", "Maicena", 193902202, true, 2002, 1));

        System.out.println("Populando lista de profesores...");
        Listas.setProfesores(new Profesor("Elson", "Rivera", 121252855,false,1940,1,1,3,2016));
        Listas.setProfesores(new Profesor("Teodoro","Palacios",153302202,true,1965,2,2,1,2018));
        Listas.setProfesores(new Profesor("Rambo", "Piñera", 142003005,false,1970,3,3,2,2015));

        System.out.println("Populando lista de servicio...");
        Listas.setServicios(new Servicio("Juana","Diaz", 123033042,true,1950,2,1,2015));
        Listas.setServicios(new Servicio("Juan","Ruz", 153033023,false,1960,1,2,2010));
        Listas.setServicios(new Servicio("Lucho","Fuentes", 133033012,true,1940,3,3,2011));
        Listas.setServicios(new Servicio("Maria","Luisa", 13033032,false,1920,3,4,2013));

    }
    private static int CalcEdad(int YOB){
        return 2019-YOB;
    }
    static void listarProfesores(){
        for (Profesor profesor: Listas.getProfesores()) {
            System.out.println("===========================");
            System.out.println("Nombre: "+profesor.getNombre());
            System.out.println("Apellido: "+profesor.getApellido());
            System.out.println("RUT: "+profesor.getRUT());
            System.out.println("¿Casado?: "+profesor.isCasado());
            System.out.println("Año nacimiento: "+profesor.getYOB());
            System.out.println("Edad: "+Util.CalcEdad(profesor.getYOB()));
            System.out.println("Departamento: "+ Listas.getDepartamentos().get(profesor.getIDD()-1).getNombre());
            System.out.println("Piso: "+profesor.getFloor());
            System.out.println("Tipo: "+Listas.getContratos().get(profesor.getIDT()-1).getDesc());
            System.out.println("Año contrato: "+profesor.getYOI());
        }
    }
    static void listarEstudiantes(){
        for (Estudiante estudiante: Listas.getEstudiantes()) {
            System.out.println("===========================");
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Apellido: " + estudiante.getApellido());
            System.out.println("RUT: " + estudiante.getRUT());
            System.out.println("¿Casado?: " + estudiante.isCasado());
            System.out.println("Año nacimiento: " + estudiante.getYOB());
            System.out.println("Edad: " + Util.CalcEdad(estudiante.getYOB()));
            System.out.println("Curso: " + Listas.getDepartamentos().get(estudiante.getIDD() - 1).getNombre());
        }
    }
    static void listarServicios(){
        for (Servicio servicios: Listas.getServicios()) {
            System.out.println("===========================");
            System.out.println("Nombre: " + servicios.getNombre());
            System.out.println("Apellido: " + servicios.getApellido());
            System.out.println("RUT: " + servicios.getRUT());
            System.out.println("¿Casado?: " + servicios.isCasado());
            System.out.println("Año nacimiento: " + servicios.getYOB());
            System.out.println("Edad: " + Util.CalcEdad(servicios.getYOB()));
            System.out.println("Piso: " + servicios.getFloor());
            System.out.println("Seccion: " + Listas.getSecciones().get(servicios.getIDS() - 1).getDesc());
            System.out.println("Año contrato: " + servicios.getYOI());
        }
    }
}
