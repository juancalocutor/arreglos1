import java.text.DecimalFormat;
import java.util.Scanner;

public class arreglos_8_notascurso {
    public static void main(String[] args) {

        System.out.println("======= SISTEMA DE NOTAS PARA ALUMNOS =======");
        System.out.println();
        // Abrimos consola y limitamos decimales
        Scanner sc = new Scanner(System.in);
        
        // Declaramos variables alumnos y cursos
        int alumnos = 0;
        double[] Mate, His, Bio;
        
        // Se pide la cantidad de alumnos
        System.out.print("¿Cuántos alumnos desea registrar?: ");
        alumnos = sc.nextInt();

        Mate = new double[alumnos];
        His = new double[alumnos];
        Bio = new double[alumnos];

        // Ciclo for con las notas de Matemáticas
        System.out.println("\nIngrese las notas para matemáticas: ");
        for (int i = 0; i < Mate.length; i++) {
            System.out.print("Estudiante " + (i + 1) + " : ");
            Mate[i] = sc.nextDouble();
        }

        // Ciclo notas de historia
        System.out.println("\nIngrese las notas para historia: ");
        for (int i = 0; i < His.length; i++) {
            System.out.print("Estudiante " + (i + 1) + " : ");
            His[i] = sc.nextDouble();
        }

        // ciclo notas biología
        System.out.println("\ningrese las notas para biología: ");
        for (int i = 0; i < Bio.length; i++) {
            System.out.print("Estudiante " + (i + 1) + " : ");
            Bio[i] = sc.nextDouble();
        }

        // Sumatoria para promedio
        double sumaMat = 0;
        double sumaHis = 0;
        double sumaBio = 0;

        for (int i = 0; i < Mate.length; i++) {
            sumaMat += Mate[i];
            sumaHis += His[i];
            sumaBio += Bio[i];
        }

        double proMate = sumaMat / Mate.length;
        double proHis = sumaHis / His.length;
        double proBio = sumaBio / Bio.length;
        double proTotal = (proMate + proHis + proBio) / 3;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("\nPromedio total del curso: " + df.format(proTotal));
        System.out.println("\nPromedio del curso por materia: ");
        System.out.println("\nPromedio matemáticas: " + df.format(proMate));
        System.out.println("Promedio historia: " + df.format(proHis));
        System.out.println("Promedio biología: " + df.format(proBio));
        System.out.println();
        System.out.print("Ingrese el identificador del aluno (1-7): ");
        int id = sc.nextInt();
        int id2 = id - 1;
        double proAlumno = (Mate[id2] + His[id2] + Bio[id2]) / 3;
        System.out.println("Promedio alumno " + id + ": " + df.format(proAlumno));
        sc.close();

    }
}
