import java.util.Scanner;
public class Ej9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double aumento, saldo2;
		System.out.print("\nIngrece el salario del obrero $");
		double saldo1=sc.nextDouble();
		aumento=saldo1*0.25;
		saldo2=saldo1+aumento;
		System.out.println("\nSalario anterior $" + saldo1 + "\nAumento $" + aumento + "\nSalario total $" + saldo2);
	}
}