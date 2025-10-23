import java.util.Scanner;
public class Ej12{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		double pagohr=0, salario, hrtrabajo, salud, subsidio=0, salarioN;
		System.out.println("\n\t---CALCULO DE PAGO MENSULA DE EMPLEADO---" + "\n\nIngrese la categoría del empleado" + "\n[1] $20,000" + "\n[2] $25,000" + "\n[3] $10,000" + "\n[4] $7,500");
		int cate=sc.nextInt();
		System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        	hrtrabajo=sc.nextDouble();
		
		switch(cate){
		case 1:
			pagohr=20000;
			break;
		case 2:
			pagohr=15000;
			break;
		case 3:
			pagohr=10000;
			break;
		case 4:
			pagohr=7500;
			break;
		default:
			System.out.println("Categoría inválida. Debe ser un número del 1 al 4");
		}	
		salario=hrtrabajo*pagohr;
		salud=salario*0.072;
		
		if (salario<1000000){
			subsidio=salario*0.15;
		}

		salarioN=salario-salud+subsidio;
		
		System.out.print("\n\n\t---RESULTADO---");
		System.out.print("\n\nCategoría: " + cate + "\nHoras trabajadas: " + hrtrabajo + "\nPago por hora $" + pagohr);
		System.out.print("\nSalario bruto $" + salario + "\nDescuento de salud (7.2%): " + salud + "\nSubsidio aplicado $" + subsidio + "\nSalario total $" + salarioN);
			
	}
}