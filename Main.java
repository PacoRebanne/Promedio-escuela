
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
       
        ClasePromedios x = new ClasePromedios();
        
        System.out.println("Ingresa el nombre del alumno: ");
        x.nombreAlumno = entrada.nextLine();
        
        System.out.println("Ingresa la calificacion 1: ");
        x.calificaciones[0] = entrada.nextInt();
        System.out.println("Ingresa la calificacion 2: ");
        x.calificaciones[1] = entrada.nextInt();
        System.out.println("Ingresa la calificacion 3: ");
        x.calificaciones[2] = entrada.nextInt();
        System.out.println("Ingresa la calificacion 4: ");
        x.calificaciones[3] = entrada.nextInt();
        System.out.println("Ingresa la calificacion 5: ");
        x.calificaciones[4] = entrada.nextInt();
       
       
        System.out.println("El promedio del alumno " + x.nombreAlumno + " es " + x.promedio());
        
        System.out.println("La calificacion del alumno " + x.nombreAlumno + " es " + x.calificacion());
        
        x.ImprimeResultado();
    }
    
}
