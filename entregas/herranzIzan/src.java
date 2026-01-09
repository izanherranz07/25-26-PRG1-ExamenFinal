import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcionElegida;
        boolean salirPrograma = false;

        while (salirPrograma == false) {

            opcionElegida = mostrarMenuPrincipal();

            if (opcionElegida == 1) {
                convertirLongitud();
            } else if (opcionElegida == 2) {
                convertirPeso();
            } else if (opcionElegida == 3) {
                convertirTemperatura();
            } else if (opcionElegida == 4) {
                System.out.println("Gracias por usar el conversor de unidades");
                salirPrograma = true;
            } else {
                System.out.println("Opción no válida");
            }
        }

        static int mostrarMenuPrincipal() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("1 - Conversión de longitud");
        System.out.println("2 - Conversión de peso");
        System.out.println("3 - Conversión de temperatura");
        System.out.println("4 - Salir");
        System.out.println("-----------------------------------");
        System.out.println("Seleccione una opción:");
        return entrada.nextInt();
    }
 
        private static void convertirLongitud() {
        Scanner entrada = new Scanner(System.in);

        String[] opciones = {
            "Metros a Kilómetros",
            "Kilómetros a Metros",
            "Metros a Millas",
            "Millas a Metros",
            "Centímetros a Pulgadas",
            "Pulgadas a Centímetros"
        };

        double[] factores = {
            1.0 / 1000,
            1000,
            0.000621371,
            1609.34,
            0.393701,
            2.54
        };

        int opcion;
        double valor;

        System.out.println("Conversión de longitud");
        for (int i = 0; i < opciones.length; i = i + 1) {
            System.out.println((i + 1) + " - " + opciones[i]);
        }

        opcion = entrada.nextInt();
        System.out.println("Introduzca el valor:");
        valor = entrada.nextDouble();

        if (opcion >= 1 && opcion <= opciones.length) {
            System.out.println("Resultado: " + (valor * factores[opcion - 1]));
        } else {
            System.out.println("Opción no válida");
        }
    }
        
         private static void convertirPeso() {
        Scanner entrada = new Scanner(System.in);

        String[] opciones = {
            "Kilogramos a Gramos",
            "Gramos a Kilogramos",
            "Kilogramos a Libras",
            "Libras a Kilogramos",
            "Gramos a Onzas",
            "Onzas a Gramos"
        };

        double[] factores = {
            1000,
            1.0 / 1000,
            2.20462,
            0.453592,
            0.035274,
            28.3495
        };

        int opcion;
        double valor;

        System.out.println("Conversión de peso");
        for (int i = 0; i < opciones.length; i = i + 1) {
            System.out.println((i + 1) + " - " + opciones[i]);
        }

        opcion = entrada.nextInt();
        System.out.println("Introduzca el valor:");
        valor = entrada.nextDouble();

        if (opcion >= 1 && opcion <= opciones.length) {
            System.out.println("Resultado: " + (valor * factores[opcion - 1]));
        } else {
            System.out.println("Opción no válida");
        }
    }
        
        } else if (t == 3) {
            System.out.println("Conversion de temperatura:");
            System.out.println("[1] Celsius a Fahrenheit");
            System.out.println("[2] Fahrenheit a Celsius");
            System.out.println("[3] Celsius a Kelvin");
            System.out.println("[4] Kelvin a Celsius");
            System.out.print("Opcion: ");
            int o = sc.nextInt();
            System.out.print("Valor: ");
            double v = sc.nextDouble();

            if (o == 1) {
                System.out.println(v + " C = " + (v * 9 / 5 + 32) + " F");
            } else if (o == 2) {
                System.out.println(v + " F = " + ((v - 32) * 5 / 9) + " C");
            } else if (o == 3) {
                System.out.println(v + " C = " + (v + 273.15) + " K");
            } else if (o == 4) {
                System.out.println(v + " K = " + (v - 273.15) + " C");
            } else {
                System.out.println("Opcion no valida");
                f = false;
            }
        } else {
            System.out.println("Tipo no valido");
        }
    }
}
