public class Decisiones {

    public static void main(String[] args) {
        int FechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String TipoPlan = "Plus";

        //codigo de prueba los operadores relacionales
//        if (FechaDeLanzamiento >= 2022){
//            System.out.println("Peliculas mas populares");
//        }else {
//            System.out.println("Peliculas Retro que aun vale la pena ver");
//        }

        if (incluidoEnElPlan && TipoPlan.equals("Plus")){
            System.out.println("Disfrute de su pelicula");
        }else{
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}
