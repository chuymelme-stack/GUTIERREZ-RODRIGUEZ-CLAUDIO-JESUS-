import java.util.Scanner;
class Primos
{
	public static void main(String args[])
	{
		Scanner yay = new Scanner(System.in);
		System.out.println("BUENAS VAMOS A VER SI TUS NUMEROS SON PRIMOS");
		System.out.print("BUENAS PUEDES DARME UN NUMERO:");
		double num = yay.nextDouble();
		
		if(num / num == 1 || num / 1 == num)
		{
			System.out.print("EL " + String.format("%.0f",num) + " ES UN NUMERO PRIMO");
		}
		else
		{
			System.out.print("EL NUMERO QUE MEDISTE NO ES UN NUMERO PRIMO");
		}
	}
}