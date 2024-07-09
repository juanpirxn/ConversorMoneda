import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        System.out.println("\n Bienvenido al conversor de moneda ✰Black Jack✰\n");

        String menu = """  
                ** Escriba el número de la opción deseada **
                1 - Pesos Colombianos a Dolares
                2 - Pesos Mexicanos a Dolares
                3 - Pesos Argentinos a Dolares
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();


            switch (opcion){
                case 1 :
                    convertir(4049.54,"Pesos Colombianos");
                    break;
                case 2 :
                    convertir(17.91,"Pesos Mexicanos");
                    break;
                case 3 :
                    convertir(917.07,"Pesos Argentinos");
                    break;
                case 9 :
                    System.out.println("Cerrando programa");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }

    }

    static void convertir(double valorDolar, String pais){
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s :", pais);
        double cantidadMoneda = leer.nextDouble();

        double dolares = cantidadMoneda / valorDolar;

        dolares = (double) Math.round(dolares * 100d) / 100;

        System.out.println("***************************************************************");
        System.out.println("Tienes $" + dolares + " Dolares");
        System.out.println("***************************************************************");

    }
}
