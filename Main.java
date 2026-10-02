
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int paste = 0;
		int quini = 0, dosci = 0, cieni = 0, cincu = 0, venti = 0, dieci = 0, cinqui = 0;
		Scanner sc = new Scanner(System.in);

		// input
		System.out.println("Insertaré cuanto dinero quieres repartir en billetes");
		System.out.println("Dame importe entero");
		paste = sc.nextInt();

		//algoritmo
		//mientras haya dinero decidirá cual es hasta haber repartido todo el dinero
		while(paste != 0){
		if (paste >= 500) {
			quini++;
			paste -= 500;
		} else if (paste >= 200) {
			dosci++;
			paste -= 200;
		} else if (paste >= 100) {
			cieni++;
			paste -= 100;
		} else if (paste >= 50) {
			cincu++;
			paste -= 50;
		} else if (paste >= 20) {
			venti++;
			paste -= 20;
		} else if (paste >= 10) {
			dieci++;
			paste -= 10;
		} else if (paste >= 5) {
			cinqui++;
			paste -= 5;
			}
		}
		// output
		System.out.println("Billetes de 500€: " + quini);
		System.out.println("Billetes de 200€: " + dosci);
		System.out.println("Billetes de 100€: " + cieni);
		System.out.println("Billetes de 50€: " + cincu);
		System.out.println("Billetes de 20€: " + venti);
		System.out.println("Billetes de 10€: " + dieci);
		System.out.println("Billetes de 5€: " + cinqui);

		System.out.println("=-=-=-=-=-=-=--==-==--=-=-=-=-=-=-=");
		System.out.println("resto a pagar...." + paste);
		sc.close();
	}
}
