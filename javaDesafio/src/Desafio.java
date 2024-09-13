import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("********************");
        System.out.println("\n Nombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponible es: "+ saldo + "$");
        System.out.println("\n************************");

        String menu = """
                *** Esriba el numero de la opcion deseada***
                1- Consultar saldo
                2- Retirar
                3- Depositar
                9- Salir
                """;
        Scanner teclado = new Scanner(System.in);

        while(opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;

                case 2:
                    System.out.println("Cual es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo){
                        System.out.println("Saldo insuficiente");
                    }else{
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actualizado es: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Cual es el valor que desea depositar ?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actualizado es : " + saldo);
                    break;
                case 9:
                    System.out.println("saliendo del programa , gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }


        }
    }
}
