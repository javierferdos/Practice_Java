package org.ferstyle.pooherencia;

public class AlumnoInternacional extends Alumno {
     private String pais;
     private double notaIdiomas;

    public AlumnoInternacional() {
        System.out.println("AlumnoInt: Inicializando contructor");
    }
     public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }
    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String saludar() {
        return super.saludar() + "Hola soy alumno del pais" + getPais() + "mi nombre es: " + getNombre();
    }

    @Override
    public double calcularPromedio() {
        //System.out.println("Calcular promedio " + AlumnoInternacional.class.getCanonicalName());
        return ((super.calcularPromedio()+3) + notaIdiomas)/4;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\npais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas +
                '}';
    }
}
