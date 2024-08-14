package org.ferstyle.ejemplo;

import org.ferstyle.pooherencia.Alumno;
import org.ferstyle.pooherencia.AlumnoInternacional;
import org.ferstyle.pooherencia.Persona;
import org.ferstyle.pooherencia.Profesor;

public class EjemploHerenciaToString {
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

        System.out.println("Hola javier, lograste tu primer GITHUB FELICIDADES ! OWOWOWOOWOIWOWOOW");
    }


    public static void imprimir(Persona persona) {
        System.out.println("=====================================================");
        System.out.println("persona = " + persona);

    }


}
