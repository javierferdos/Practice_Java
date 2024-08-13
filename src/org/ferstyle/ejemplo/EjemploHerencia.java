package org.ferstyle.ejemplo;

import org.ferstyle.pooherencia.Alumno;
import org.ferstyle.pooherencia.AlumnoInternacional;
import org.ferstyle.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("=========== creando instancia de alumno=======");
        Alumno alumno = new Alumno();
        alumno.setNombre("javier");
        alumno.setApellido("alba");
        alumno.setNotaMatematica(4.7);
        alumno.setNotaCastellano(3.5);
        alumno.setNotaHistoria(4.0);

        System.out.println("========creando instancia alumno int============");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("oscar");
        alumnoInt.setApellido("es");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(17);
        alumnoInt.setInstitucion("Instituto nacional");

        System.out.println("===========creando instancia profesor ===========");
        Profesor profesor = new Profesor();
        profesor.setNombre("luis");
        profesor.setApellido("cor");
        profesor.setAsignatura("matematicas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor: "+profesor.getAsignatura() + " " + profesor.getNombre() +" " +profesor.getApellido());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + "es una lcase hija de la clase padre " + padre);
            clase=clase.getSuperclass();

            
        }
    }
}
