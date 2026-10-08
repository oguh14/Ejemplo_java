import java.util.Scanner;
//crear un metodo estatico para pedir pies y pulgadas y devolver la estatura en cm
//1 pie (ft ') --> 30,48 cm 1 pulgada (in '') --> 2,54cm 
public class Main {

	public static double convertirPiesYPulgadas(int pies, int pulgadas) { //metodo para convertir pies y pulgadas
		double altura = 0; // variable donde iremos sumando la conversión (cm)
		altura = pies * 30.48; // pies a cm
		if (pulgadas < 12) { // medida en pies q nunca debe tener 12 o más pulgadas
			altura += pulgadas * 2.54; // añado pulgadas a cm
		} else {
			System.out.println("pulgadas tienen que ser menos que 12");
		}
		return altura; //pedimos que devuelva altura
	}

	public static int[] convertirCentimetros(double cm) { //metodo para convertir centimetros

		int[] pareja = { 0, 0 }; // array
		int pies = 0; //variables pies y pulg
		int pulg = 0;
		while (cm >= 30.48) {// 2 while para definir cuanto es el valor en cm de pulgadas y pies para que sepa cndo aumentar en 1
			pies++;
			cm -= 30.48;
		}
		while (cm >= 2.54) {
			pulg++;
			cm -= 2.54;
		}
		pareja[0] = pies;
		pareja[1] = pulg;
		return pareja;
	}

	public static String convertirconCadenaACentimetros(double cm) { //metodo para convertir cm pro a modo de String

		String convertida;
		int pies = 0;
		int pulg = 0;
		while (cm >= 30.48) {
			pies++;
			cm -= 30.48;
		}
		while (cm >= 2.54) {
			pulg++;
			cm -= 2.54;
		}
		convertida = "Los centímetros convertidos son: " + pies + " pies y " + pulg + " pulgadas.";	
		return convertida;
	}

	public static void main(String[] args) { //main

		Scanner sc = new Scanner(System.in);
		System.out.println("convertir pies a cm (1) o  cm a pies (2) o cm con STRING (3) ");
		int opcion = sc.nextInt();

		//else if para las opciones de conversion
		if (opcion == 1) { // opción 1: convertir pies y pulgadas a centímetros

			System.out.println("dime pies: ");
			int pies = sc.nextInt();
			System.out.println("dime pulgadas: ");
			int pulg = sc.nextInt();

			double estatura = convertirPiesYPulgadas(pies, pulg);
			System.out.println("la estatura convertida en cm es: " + estatura);
		} // inversa
		else if (opcion == 2) { // 2) cm → pies+pulgadas
			System.out.println("dime centimetros (double): ");
			double centimetros = sc.nextDouble();

			int[] resultado = convertirCentimetros(centimetros);

			System.out.println("la estatura es: ");
			System.out.println("pies: " + resultado[0]);
			System.out.println("pulgadas: " + resultado[1]);
		} else {

			System.out.println("dime centimetros (double): ");
			double centimetros = sc.nextDouble();
			String texto = convertirconCadenaACentimetros(centimetros);
			System.out.println("ESTATURA son: " + texto); // 3) cm → pies+pulgadas pero devolviendo un String
		}

		System.out.println("chao");

		sc.close();
	}
}