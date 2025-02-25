package com.leviplanelles.tema06.POO1E3;

import com.leviplanelles.tema06.lib.IO;

public class CentroEducativo {
    public static Alumno[] alumnos = new Alumno[100];
    static int posicion = 0;
    public static void nuevoAlumno() {
        String NIA = IO.solicitarString("NIA del alumno:", 0, 10000000);
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getNia().equals(NIA)) {
                System.out.println("No se puede añadir un alumnos porque ya existe uno igual");
                break;
            } else {
                String nombre = IO.solicitarString("Nombre del alumno:");
                String apellido = IO.solicitarString("Apellido del alumno:");
                String fecha = IO.solicitarString("Fecha de nacimiento:");
                String grupo = IO.solicitarString("Grupo:");
                int telefono = IO.solicitarInt("Teléfono contacto:", 0, 1000000000);

                if (alumnos[posicion] == null) {
                    alumnos[posicion] = new Alumno(NIA, nombre, apellido, fecha, grupo, telefono);
                    posicion++;
                    break;

                }
            }
        }
    }
    public static void bajaAlumnno() {
        String NIA = IO.solicitarString("NIA del alumno:", 0, 10000000);
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNia().equals(NIA)) {
                System.out.println("Se ha encontrado a "+ alumnos[i].getNombre() +" con el NIA: " + NIA);
                System.out.println("Eliminando...");
                alumnos[i] = null;
                break;
            } else {
                System.out.println("El alumno que has ingresado no consta en la lista de alumnos.");
                break;
            }
        }
    }

    public static void porGrupo() {
        String grupo = IO.solicitarString("Indique el grupo:");
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getGrupo().equals(grupo)) {
                System.out.println(alumnos[i].toString());
            }
        }
    }
    public static void porEdad() {
        int fechaNacimiento = IO.solicitarInt("Indique la edad:",0,100);
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getEdad() == fechaNacimiento) {
                System.out.println(alumnos[i].toString());
            }
        }
    }
    public static void porNia() {
        String NIA = IO.solicitarString("NIA del alumno:", 0, 10000000);
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getNia().equals(NIA)) {
                System.out.println("No se puede añadir un alumnos porque ya existe uno igual");
                break;
            }
        }
    }
    public static void porApellidos() {
        String apellido = IO.solicitarString("Pon parte de un apellido:");
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getApellidos().contains(apellido)) {
                System.out.println(alumnos[i].toString());

            }
        }
    }
}
