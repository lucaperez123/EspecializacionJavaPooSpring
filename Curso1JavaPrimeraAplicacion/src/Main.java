//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bievenido(a) a Screen Match");
        System.out.println("Pelicula: Matrix");

         int FechaDeLanzamiento = 1999;
         boolean incluidoEnElPlan = true;
         double notaDeLaPelicula = 8.2;

         double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        /* text blocks*/
        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en:
                """ + FechaDeLanzamiento;
        System.out.println(sinopsis);

        /*conversion de valores a traves de el casteo*/
        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);





    }
}