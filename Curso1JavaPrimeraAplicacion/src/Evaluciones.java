import java.util.Scanner;

public class Evaluciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        while(nota != -1){
            System.out.println("Escribe la nota que le darias a la pelicula matriz");
            nota = teclado.nextDouble();

            //si el usuario escribe -1 no se suma a la media y corta el ciclo
            if (nota != -1){
                mediaEvaluaciones += nota;
                totalEvaluaciones++;
            }

        }
        System.out.println("La media de evaluaciones para matrix es: "+mediaEvaluaciones/totalEvaluaciones);
        }
    }
