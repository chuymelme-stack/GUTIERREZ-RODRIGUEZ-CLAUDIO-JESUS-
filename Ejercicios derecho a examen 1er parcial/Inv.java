import java.util.Scanner;
class Inv
{
	public static void main(String args[])
	{
		Scanner yay = new Scanner(System.in);
		System.out.print("DIME LA CANTIDAD DE DINERO QUE DESEA DEPOSITAR:");
		double din = yay.nextDouble();
		double porc;
		porc= (2*din)/100;
		System.out.print("LA CANTIDAD DE CRECIMIENTO DE SU DINERO ES DE " + String.format("%.0f",porc) + " PESOS" + " POR EL 2%");
	}
}