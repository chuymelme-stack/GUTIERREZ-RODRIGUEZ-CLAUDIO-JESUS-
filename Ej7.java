import java.util.Scanner;
public class Ej7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double total, des ;
		System.out.print("\n\t--- DESCUENTO 15% EN SU COMPRA ---" + "\n\nIntroduza el total de la cuenta del cliente $");
		double cuenta=sc.nextDouble();
		des=cuenta*0.15;
		total=cuenta-des;
		System.out.println("\nTotal a pagar $" + total);
	}
}