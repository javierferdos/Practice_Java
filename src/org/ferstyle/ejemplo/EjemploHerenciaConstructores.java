package org.ferstyle.ejemplo;

import org.ferstyle.pooherencia.Alumno;
import org.ferstyle.pooherencia.AlumnoInternacional;
import org.ferstyle.pooherencia.Persona;
import org.ferstyle.pooherencia.Profesor;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        System.out.println("=========== creando instancia de alumno=======");
        Alumno alumno = new Alumno("javier","alba",15, "Instito nacional");
        alumno.setNotaMatematica(4.7);
        alumno.setNotaCastellano(3.5);
        alumno.setNotaHistoria(4.0);

        System.out.println("========creando instancia alumno int============");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("oscar", "es", "Australia");
        alumnoInt.setEdad(17);
        alumnoInt.setInstitucion("Instituto nacional");
        alumnoInt.setNotaIdiomas(4.5);
        alumnoInt.setNotaMatematica(4.2);
        alumnoInt.setNotaCastellano(3.8);
        alumnoInt.setNotaHistoria(4.0);

        System.out.println("===========creando instancia profesor ===========");
        Profesor profesor = new Profesor("luis", "cor", "matematicas");
        profesor.setEdad(27);
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
    }
    public static void imprimir(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());

        if (persona instanceof Alumno) {
            System.out.println("Institución: " + ((Alumno)persona).getInstitucion());
            System.out.println("Nota matemáticas: " + ((Alumno)persona).getNotaMatematica());
            System.out.println("Nota historia: " + ((Alumno)persona).getNotaHistoria());
            System.out.println("Nota castellano: " + ((Alumno)persona).getNotaCastellano());
        } if (persona instanceof AlumnoInternacional) {
            System.out.println("Institución: " + ((AlumnoInternacional)persona).getInstitucion());
            System.out.println("Nota matemáticas: " + ((AlumnoInternacional)persona).getNotaMatematica());
            System.out.println("Nota historia: " + ((AlumnoInternacional)persona).getNotaHistoria());
            System.out.println("Nota castellano: " + ((AlumnoInternacional)persona).getNotaCastellano());
            System.out.println("============== sobre escritura promedio =================================");
            System.out.println(((AlumnoInternacional) persona).calcularPromedio());
            System.out.println("================================");
        } if (persona instanceof Profesor) {
            Profesor profesor = (Profesor) persona;
            System.out.println("Asignatura: " + profesor.getAsignatura());
        }
        System.out.println("Sobre escritura =========================================");

        System.out.println(persona.saludar());
        System.out.println("==================================");

    }


}
