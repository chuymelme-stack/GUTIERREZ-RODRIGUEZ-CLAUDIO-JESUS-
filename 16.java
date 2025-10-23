import java.util.Scanner;
class Par
{
	public static void main(String args[])
	{
		Scanner yay = new Scanner(System.in);
		System.out.println("BUENAS VAMOS A VER SI TUS NUMEROS SON PARES O IMPARES");
		System.out.print("BUENAS PUEDES DARME UN NUMERO:");
		double num = yay.nextDouble();
		
		if(num % 2 == 0)
		{
			System.out.print("EL " + String.format("%.0f",num) + "  ES: PAR");
		}
		else
		{
			System.out.print("EL NUMERO QUE ME DISTE ES IMPAR ");
		}
	}
}