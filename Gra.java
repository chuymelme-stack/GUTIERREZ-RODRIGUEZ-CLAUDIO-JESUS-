import java.util.Scanner;
class Gra
{	
	public static void main(String args[])
	{
		Scanner yay = new Scanner(System.in);
		System.out.print("DIJITE LOS GRADOS QUE DESEA CAMBIAR:°");
		double grr = yay.nextDouble();
		double FA,ke;
		FA=(1.8*grr)+32;
		ke=grr+273.15;

		System.out.println("LOS GRADOS FAHRENHEIT SON:°" + FA);
		System.out.print("LOS GRADOS KELVIN SON:°" + ke);
			
	}
}