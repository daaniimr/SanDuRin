import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
     // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad en kilómetros
        System.out.print("Ingresa la cantidad en kilómetros: ");
        double kilometros = scanner.nextDouble();

        // Calcular las millas (1 kilómetro = 0.621371 millas)
        double millas = convertirAKilometrosAMillas(kilometros);

        // Calcular los metros (1 kilómetro = 1000 metros)
        double metros = convertirAKilometrosAMetros(kilometros);

        // Calcular los centímetros (1 kilómetro = 100,000 centímetros)
        double centimetros = convertirAKilometrosACentimetros(kilometros);

        // Calcular los decímetros (1 kilómetro = 10,000 decímetros)
        double decimetros = convertirAKilometrosADecimetros(kilometros);

        // Mostrar los resultados
        System.out.println(kilometros + " kilómetros son equivalentes a " + millas + " millas.");
        System.out.println(kilometros + " kilómetros son equivalentes a " + metros + " metros.");
        System.out.println(kilometros + " kilómetros son equivalentes a " + centimetros + " centímetros.");
        System.out.println(kilometros + " kilómetros son equivalentes a " + decimetros + " decímetros.");

        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();
    }

    // Método para convertir kilómetros a millas
    private static double convertirAKilometrosAMillas(double kilometros) {
        return kilometros * 0.621371;
    }

    // Método para convertir kilómetros a metros
    private static double convertirAKilometrosAMetros(double kilometros) {
        return kilometros * 1000;
    }

    // Método para convertir kilómetros a centímetros
    private static double convertirAKilometrosACentimetros(double kilometros) {
        return kilometros * 100000;
    }

    // Método para convertir kilómetros a decímetros
    private static double convertirAKilometrosADecimetros(double kilometros) {
        return kilometros * 10000;
    }
}
