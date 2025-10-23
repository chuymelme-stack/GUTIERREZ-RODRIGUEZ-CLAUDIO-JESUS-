import java.util.Scanner;
class Pul{
	public static void main(String args[])
	{	
		Scanner yay = new Scanner(System.in);
		System.out.print("DIJITE SU EDAD CHI?: ");
		int edad = yay.nextInt();
		double pol=0;
		pol = (220-edad)/10;
		System.out.print("SUS PUSACIONES POR MINUTO SON:" + pol);
	}
}