import java.util.Scanner;
public class Ej4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double edad, año=2025;
		System.out.print("\nintroduce tu año de nacimiento_");
		double año1=sc.nextDouble();
		edad=año-año1;
		System.out.println("\nTu edad es: " + edad);
	}
}