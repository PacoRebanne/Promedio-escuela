# Promedio-escuela
Calcular el promedio de un alumno



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FTD
 */
public class ClasePromedios {
    String nombreAlumno = "";
    int[] calificaciones = {0,0,0,0,0};
    int promedioAlumno = 0;
    String calificacionAlumno = "";
    
    public int promedio()
    {
        for(int i=0; i<5; i++)
        {
           promedioAlumno = promedioAlumno + calificaciones[i];
        }
        promedioAlumno = promedioAlumno / 5;
        return promedioAlumno;
    } 
    
    public String calificacion(){
        
        if(promedioAlumno <= 50)
            calificacionAlumno = "F";
        else if(promedioAlumno >= 51 && promedioAlumno <= 60)
            calificacionAlumno = "E";
        else if(promedioAlumno >= 61 && promedioAlumno <= 70)
            calificacionAlumno = "D";
        else if(promedioAlumno >= 71 && promedioAlumno <= 80)
            calificacionAlumno = "C";
        else if(promedioAlumno >= 81 && promedioAlumno <= 90)
            calificacionAlumno = "B";
        else if(promedioAlumno >= 91 && promedioAlumno <= 100)
            calificacionAlumno = "A";
        else
            calificacionAlumno = "-";
        
        return calificacionAlumno;
    }
    
    public void ImprimeResultado()
    {
        System.out.println("Nombre del Estudiante: " + nombreAlumno);
        System.out.println("Calificacion 1: " + calificaciones[0]);
        System.out.println("Calificacion 2: " + calificaciones[1]);
        System.out.println("Calificacion 3: " + calificaciones[2]);
        System.out.println("Calificacion 4: " + calificaciones[3]);
        System.out.println("Calificacion 5: " + calificaciones[4]);
        System.out.println("Promedio: " + promedioAlumno);
        System.out.println("Calificacion: " + calificacionAlumno);
    }
    
    
}
