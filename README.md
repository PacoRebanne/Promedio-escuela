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

En esta sección deberá definir lo siguiente:
Documentación (GitHub o ReadTheDocs.io)
1.	Generar resumen ejecutivo que cuente con los siguientes elementos en el archivo README.md dentro del repositorio:
a.	Descripción, problema identificado, solución, arquitectura
b.	Tabla de contenidos (ToC) con enlaces o a la sección wiki dentro del repositorio o algún medio externo como ReadTheDocs.io

Descripción:

Es una herramienta de gestión de base de datos para el manejo de las calificaciones de una escuela, desarrollada en el lenguaje de JAVA para uso interno de la institución con el objetivo de poder agilizar a los profesores su trabajo en el sistema.

Problema:

El problema es que a los profesores en ocasiones le es mas tardado poder realizar las operaciones para ingresarla a la base de datos del sistema por lo cual el programa realiza la captura del nombre del alumno, así como el ingreso de las calificaciones por materia, esto ayuda a que los tiempos sean menores y así poder acortar tiempos.

2.	Requerimientos:
a.	Servidores de aplicación, web, bases de datos, etc.
b.	Paquetes adicionales.
c.	Versión de Java, etc.


•	Visualización de información
•	Opción de agregar información desde el software
•	Buscar por alumno
•	Agregar y modificar la información
•	Guardar los cambios
•	Generar reportes
•	Exportar a Excel
•	Generar PDF
•	Guardar PDF
•	Imprimir calificaciones














3.	Instalación:
a.	¿Cómo instalar el ambiente de desarrollo?
b.	¿Cómo ejecutar pruebas manualmente?
c.	¿Cómo implementar la solución en producción en un ambiente local o en la nube como Heroku?

•	Descargar el proyecto del repositorio
•	Descomprimir el archivo para obtener la carpeta del proyecto
•	Abrimos la carpeta del proyecto
•	Abrimos la carpeta de bin en la cual encontraremos el archivo .jar
•	Iniciamos el ejecutable

4.	Configuración:
a.	Configuración del producto (archivos de configuración).
b.	Configuración de los requerimientos.


•	Instalamos la versión más actual de java ya que sin ella no podremos correr el software
•	Configuración del ambiente JAVA
•	Obtenemos la plantilla de Excel para que podamos pasar la información que necesitamos
•	configuramos nuestra base de datos en la pantalla de Excel del software y la cargamos

5.	Uso:
a.	Sección de referencia para usuario final. Manual que se hará referencia para usuarios finales.
b.	Sección de referencia para usuario administrador.


El software será para uso interno de la escuela con niveles de usuario con lo que cada uno va tener permiso de acuerdo con sus responsabilidades, se instalará en cada uno de los equipos de los miembros profesores para que pueda hacer uso del mismo.
El usuario administrado, tendrá una cuenta diferente con al cual tendrá acceso a poder hacer modificaciones y todos los cambios necesarios a las calificaciones.


6.	Contribución:
a.	Guía de contribución para usuarios.
b.	Debe contar con pasos específicos para clonar repositorio, crear un nuevo branch, enviar el pull request, esperar a hacer el merge.

•	Abrimos el repositorio
•	Link del repositorio ()
•	Tenemos dos opciones a elegir (abrir en el equipo o descargar como zip)

7.	Roadmap:
a.	Requerimientos que se implementarán en un futuro.

Con forme se vaya implementando el programa dentro de la escuela y con la experiencia de los usuarios del área, podremos identificar errores y con eso ellos nos podrán notificar y decir que es lo que podemos mejorar en el software. Se planea sacar actualizaciones y mejoras del software hasta que lleguemos a la versión más estable y completa. 



