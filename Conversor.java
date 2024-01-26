import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad en kilómetros
        System.out.print("Ingresa la cantidad en kilómetros: ");
        double kilometros = scanner.nextDouble();

        // Calcular las millas (1 kilómetro = 0.621371 millas)
        double millas = kilometros * 0.621371;

        // Mostrar el resultado
        System.out.println(kilometros + " kilómetros son equivalentes a " + millas + " millas.");

	System.out.println(kilometros + " kilómetros son equivalentes a " + metros + " 		 metros.");
        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();
        
    
    }
    
    // Método para convertir kilómetros a metros
    private static double convertirAKilometrosAMetros(double kilometros) {
        return kilometros * 1000;
    }
}
