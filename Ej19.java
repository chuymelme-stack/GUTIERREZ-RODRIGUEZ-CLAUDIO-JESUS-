import java.util.Scanner;
public class Ej19{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double gine, trauma, pedia;
		
		System.out.print("\n\tIngrese el presupuesto anual del hospital $");
		double presu=sc.nextDouble();
		gine=presu*0.40;
		trauma=presu*0.30;
		pedia=presu*0.30;

		System.out.print("\n\t---Resultado de distribución---" + "\n\tPresupuesto total: $" + String.format("%.2f",presu));
		System.out.print("\n\tGinecología (40%): $" + String.format("%.2f",gine) + "\n\tTraumatología (30%): $" + String.format("%.2f",trauma) + "\n\tPediatría (30%): $" + String.format("%.2f",pedia));
	}
}
		