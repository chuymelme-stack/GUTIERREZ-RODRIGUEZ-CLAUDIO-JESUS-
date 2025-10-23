import java.util.Scanner;
public class Ej11{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double may, men, prom;
		
		System.out.print("\nIntroduce el primer número ");
		double num1=sc.nextDouble();
		System.out.print("\nIntroduce el segundo número ");
		double num2=sc.nextDouble();
		System.out.print("\nIntroduce el tercer número ");
		double num3=sc.nextDouble();
		
		if (num1==num2 && num2==num3){
			System.out.print("\nLos tres números son iguales");
		}else{
			}if (num1>num2 && num1>num3){
				may=num1;
			}else if (num2>num1 && num2>num3){
				may=num2;
			}else{
				may=num3;
		}
		if (num1<num2 && num1<num3){
			men=num1;
		}else if (num2<num1 && num2<num3){
			men=num2;
		}else{
			men=num3;
		}
		System.out.print("\nNúmero mayor " + may + "\nNúmero de menor " + men); 
	}
}