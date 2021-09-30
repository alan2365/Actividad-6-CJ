package com.mycompany.actividad_6_cj;

/**
 *
 * @author AlanEduardo
 */
public class Actividad_6 {
    
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.nombre = "Alfredo";
        alumno.calificacion[0] = 50.0;
        alumno.calificacion[1] = 10.0;
        alumno.calificacion[2] = 100.0;
        alumno.calificacion[3] = 90.0;
        alumno.calificacion[4] = 100.0;
        Double promedio = promedio(alumno.calificacion);
        String calificacion = calificacion(promedio);
        imprimirCalificacion(alumno, promedio, calificacion);
    }

    public static Double promedio(Double[] calificacion) {
        Double promedio = 0d;
        Double suma = 0d;
        for(int i = 0; i < calificacion.length; i++){
            suma += calificacion[i];
        }
        promedio = suma / calificacion.length;
        return promedio;
    }

    public static String calificacion(Double promedio) {
        String calificacion = "";
        if (promedio <= 50) {
            calificacion = "F";
        }else if(promedio >= 51 && promedio <= 60){
            calificacion = "E";
        }else if(promedio >= 61 && promedio <= 70){
            calificacion = "D";
        }else if(promedio >= 71 && promedio <= 80){
            calificacion = "C";
        }else if(promedio >= 81 && promedio <= 90){
            calificacion = "B";
        }else if(promedio >= 91 && promedio <= 100){
            calificacion = "A";
        }
        
        return calificacion;
    }

    public static void imprimirCalificacion(Alumno alumno, Double promedio, String calificacion) {
        System.out.println("Nombre del estudiante: " + alumno.nombre);
        for(int i = 0; i < alumno.calificacion.length; i++){
            System.out.println("Calificacion " + (i+1) + ": " + alumno.calificacion[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }
}
