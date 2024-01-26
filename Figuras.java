import java.util.Scanner;

public class Figuras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Áreas Geométricas");

        // Calcular área de un círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radioCirculo = scanner.nextDouble();
        double areaCirculo = calcularAreaCirculo(radioCirculo);
        System.out.println("Área del círculo: " + areaCirculo);


	// Calcular área de un rectángulo
        System.out.print("Ingrese la longitud del rectángulo: ");
        double longitudRectangulo = scanner.nextDouble();
        System.out.print("Ingrese la anchura del rectángulo: ");
        double anchuraRectangulo = scanner.nextDouble();
        double areaRectangulo = calcularAreaRectangulo(longitudRectangulo, anchuraRectangulo);
        System.out.println("Área del rectángulo: " + areaRectangulo);

	// Calcular área de un cilindro
        System.out.print("Ingrese el radio del cilindro: ");
        double radioCilindro = scanner.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        double alturaCilindro = scanner.nextDouble();
        double areaCilindro = calcularAreaCilindro(radioCilindro, alturaCilindro);
        System.out.println("Área del cilindro: " + areaCilindro);

	//Calcular area de una piramide
	System.out.print("Ingrese la longitud del lado de la base de la pirámide: ");
        double ladoBasePiramide = scanner.nextDouble();
        System.out.print("Ingrese la altura de la pirámide: ");
        double alturaPiramide = scanner.nextDouble();
        double areaPiramide = calcularAreaPiramide(ladoBasePiramide, alturaPiramide);
        System.out.println("Área de la pirámide: " + areaPiramide);

	// Calcular área de un rombo
        System.out.print("Ingrese la longitud de la diagonal mayor del rombo: ");
        double diagonalMayorRombo = scanner.nextDouble();
        System.out.print("Ingrese la longitud de la diagonal menor del rombo: ");
        double diagonalMenorRombo = scanner.nextDouble();
        double areaRombo = calcularAreaRombo(diagonalMayorRombo, diagonalMenorRombo);
        System.out.println("Área del rombo: " + areaRombo);



        scanner.close();





      // Método para calcular el área de un círculo
    	private static double calcularAreaCirculo(double radio) {
        	return Math.PI * Math.pow(radio, 2);
   	 }

	// Método para calcular el área de un rectángulo
    	private static double calcularAreaRectangulo(double longitud, double anchura) {
        	return longitud * anchura;
    	}

	// Método para calcular el área de un cilindro
    	private static double calcularAreaCilindro(double radio, double altura) {
        // El área de un cilindro es la suma del área de dos círculos (las bases) y el área de un rectángulo (la superficie lateral)
        	double areaBases = 2 * calcularAreaCirculo(radio);
        	double areaLateral = 2 * Math.PI * radio * altura;
        	return areaBases + areaLateral;
    	}

	 // Método para calcular el área de una pirámide de base cuadrada
    	private static double calcularAreaPiramide(double ladoBase, double altura) {
        	// El área de la base de la pirámide es ladoBase * ladoBase (área de un cuadrado)
        	double areaBase = Math.pow(ladoBase, 2);
   	}

	private static double calcularAreaRombo(double diagonalMayor, double diagonalMenor) {
       	 // El área de un rombo es (diagonalMayor * diagonalMenor) / 2
        	return (diagonalMayor * diagonalMenor) / 2;
    }
  }
}
