import java.util.Scanner;
public class Ej1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double pie=3.28084, pul=39.3701, con1, con2;
		System.out.print("\n\t--- DE METROS CONVERTIDOS A PIES Y PULGADAS ---" + "\nIntroduzca los metros que se necesitan convertir_");
		double metro=sc.nextDouble();
		con1=metro*pie;
		con2=metro*pul;
		System.out.println("\n\nMetros: " + metro + "\nPies: " + String.format("%.2f", con2) + "\nPulgadas: " + String.format("%.2f", con2));
	}
}