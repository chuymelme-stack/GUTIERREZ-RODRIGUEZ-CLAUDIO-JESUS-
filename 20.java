import java.util.Scanner;

public class Descuento
{
	public static void main(String args[])
	{
		Scanner yay = new Scanner(System.in);
		
		double total;
		double Des;
		double dineroDes;
		double tota;
		int num;
		
		System.out.println("DEJAME VER SI TE DOY UN DESCUENTO");
		System.out.print("INGRESA EL TOTAL DE LA COMPRA:");
		// Asignacion de total
		total = yay.nextDouble(); 
		
		System.out.print("INGRESA EL NUMERO DE LA SUERTE (0 a 99): ");
		num = yay.nextInt(); 
		
		if (num < 74) 
		{
			Des = 0.15; 
		} 
		else 
		{
			Des = 0.20; 
		}
		
		dineroDes = total * Des; 
		tota = total - dineroDes;

		System.out.println("PORCENTAJE APLICADO: " + (Des * 100) + "%");
		System.out.println("DINERO DESCONTADO: " + String.format("%.2f", dineroDes));
		System.out.println("TOTAL A PAGAR: " + String.format("%.2f", tota));
		
	}
}