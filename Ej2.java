import java.util.Scanner;
public class Ej2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double pi=3.1415, area;
		System.out.print("\n\t--- Area de un circulo ---" + "\nIntroduzca el radio de circunferencia de su circulo_");
		double radio=sc.nextDouble();
		area=pi*Math.pow(radio, 2);
		System.out.println("Area: " + String.format("%.2f", area));
	}
}