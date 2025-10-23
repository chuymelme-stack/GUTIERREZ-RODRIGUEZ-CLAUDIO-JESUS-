import java.util.Scanner;
class Cua
{
	public static void main(String args[])
	{
		Scanner yay = new Scanner(System.in);
		
		System.out.println("RESOLVER AX^2 + BX + C = 0");
		System.out.print("INGRESA A: ");
		double a = yay.nextDouble();
		System.out.print("INGRESA B: ");
		double b = yay.nextDouble();
		System.out.print("INGRESA C: ");
		double c = yay.nextDouble();
		
		if (a == 0)
		{
			System.out.println("\nERROR: A es 0. La ecuacion no es cuadratica.");
		} 
		else
		{
			double d = b*(b - 4)*a*c;
			
			if (d < 0)
			{
				System.out.println("\nERROR: Raices imaginarias.");
			} 
			else
			{
				double r1 = (-b + Math.sqrt(d)) / (2 * a);
				
				if (d == 0)
				{
					System.out.println("\nRAIZ REAL UNICA:");
					System.out.print("X: " + r1);
				} 
				else
				{
					double r2 = (-b - Math.sqrt(d)) / (2 * a);
					
					System.out.println("\nRAICES REALES:");
					System.out.print("X1: " + r1);
					System.out.print("X2: " + r2);
				}
			}
		}
	}
}